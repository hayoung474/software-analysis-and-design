import java.util.*;

public class {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num= s.nextInt(); // ��� �ܾ �Է��� �� �Է¹޴´�
		int count=-1; // ���ǿ� �ش��ϴ� �ܾ ����� ī��Ʈ
		
		for(int i=0;i<num+1;i++) { //�ܾ� ���� ��ŭ �ݺ�
			
			String str=s.nextLine(); //���ڸ� �Է¹޴´�
			
			String[] alpha = new String[26]; //���ĺ� ������ŭ �迭 ����
			String[] list=new String[100]; //���� ���ڸ� ���� 
			
			list=str.split(""); //���ڿ� �и�
			int length=str.length(); //���ڿ� ���̸�ŭ ���� �ݺ� 
			
			String temp;
			boolean check=true;
			int index=0;
			
			for(int j=0; j<length;j++) {
				
				temp=list[j];
				if(j==0) {
					alpha[index]=temp;
				}
				if(alpha[index].equals(temp))  //���� �� ���� ���ٸ� 
					continue;
				else { //�ٸ��ٸ� ? 
					index++; //�ε����� �ø��� 
					for(int k=0;k<index-1;k++) { 
						if(alpha[k].equals(temp)) {
							check=false;
							break;
						}
					}
					alpha[index]=temp;
				}			
			}
			if(check) { //���࿡ check�� true ��� ? 
				count++; //ī��Ʈ ++ 
			}			
		}
		System.out.print(count);
		s.close();		
	}
}
