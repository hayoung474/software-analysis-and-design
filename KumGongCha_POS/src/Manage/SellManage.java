package Manage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;

import Manage.manageMember.memberInfo;
import Order.NameAndCount;

public class SellManage {

	public static int i=0;

	public void WriteSaleLog(Vector SaleMenu, String Date){
		
		for(int i=0; i<SaleMenu.size();i++) {
			String menuname="";
			int count=0;
			NameAndCount menu = (NameAndCount) SaleMenu.elementAt(i);
			menuname=menu.MemuName;
			count=menu.MenuCount;
			
		    try{
	            //File file = new File("C:\\Users\\멍어지\\Desktop\\왜가리\\SellLog.txt");
		    	File file = new File("SellLog.txt");
	            BufferedWriter BW = new BufferedWriter(new FileWriter(file,true));       
	            PrintWriter PW = new PrintWriter(BW,true);
	            if(file.isFile() && file.canWrite()){

            		String str= Date+"\t"+menuname+"\t"+count+""+"\t";  		
            		PW.write(str+"\n");
	            	PW.flush();
	                PW.close();
	            }
	        }catch (IOException e) {
	            System.out.println(e);
	        }
			
			
			
		}
	}
}
