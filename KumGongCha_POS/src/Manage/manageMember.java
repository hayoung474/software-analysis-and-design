package Manage;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import GUI.Register;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;



public class manageMember {
	
	class memberInfo
	{		
		public String name;
		public String id;
		public String pw;
		public String grade;
	}


	public static int i=0;
	public String CheckID;
	public String CheckPW;
	ArrayList<memberInfo> memberList = new ArrayList<memberInfo>();
	public boolean successLogin=false;
	public String LoginedName;
	public String LoginedGrade;

	JOptionPane aa=new JOptionPane(); 

	public void AddMember(String id , String pw , String name , String grade){
		
		
		memberInfo m1 = new memberInfo();	
		m1.name=name;
		m1.id=id;
		m1.pw=pw;
		m1.grade =grade;
		memberList.add(m1);	
	
		int cnt = memberList.size();

	    try{
            //File file = new File("C:\\Users\\멍어지\\Desktop\\왜가리\\memberInfo.txt");
	    	File file = new File("memberInfo.txt");
            BufferedWriter BW = new BufferedWriter(new FileWriter(file,true));       
            PrintWriter PW = new PrintWriter(BW,true);
            if(file.isFile() && file.canWrite()){
            	for(int i=0 ; i < cnt; i++) {
            		String str= (String)memberList.get(i).grade+"\t"+(String)memberList.get(i).name+"\t"+(String)memberList.get(i).id+"\t"+(String)memberList.get(i).pw;     		
            		PW.write(str+"\n");

        		}
            	PW.flush();
                PW.close();
            }
        }catch (IOException e) {
            System.out.println(e);
        }

	}
	public void CheckMember(String id , String pw) throws IOException {
		CheckID=id;
		CheckPW=pw;	
		boolean idok=false;
		boolean pwok=false;
		//File file = new File("C:\\Users\\멍어지\\Desktop\\왜가리\\memberInfo.txt");
		File file = new File("memberInfo.txt");
		if(file.exists()){
			BufferedReader inFile = new BufferedReader(new FileReader(file));
			String sLine = null;
			while( (sLine = inFile.readLine()) != null ) { 
				String temp[] = sLine.split("\t");
				
				if(temp[2].equals(CheckID)) {
					idok=true;
					if(temp[3].equals(CheckPW)) {
						successLogin=true;
						pwok=true;
						LoginedName=temp[1];
						LoginedGrade=temp[0];
						break;
						
					}
					else {
						aa.showMessageDialog(null,"비밀번호가 틀렸습니다");
						successLogin=false;
						pwok=false;
						break;
					}
				}
				else {
					continue;
				}
				
			}
			if((sLine==null)&&(idok==false)) {
				aa.showMessageDialog(null,"일치하는 아이디가 없습니다");
				successLogin=false;
				idok=false;
			}		
			
		}

	}	

}
