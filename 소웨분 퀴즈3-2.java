package quiz333302;
import java.util.Scanner;

public class {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int testCase=0;
		testCase=s.nextInt(); 
		
		for(int i=0;i<testCase;i++) {
			
			int stuNum=s.nextInt(); //�л��� ������� �Է¹ޱ�
			int subStr=s.nextInt(); //����� �л��� �����ߴ��� �Է¹ޱ�
			
			int [] stuArr=new int [stuNum]; //�л� �� ��ŭ �迭 ����
			int [] SubArr = new int [subStr]; //������ �л��� �迭 
			int [] unSubArr = new int [stuNum-subStr]; //���� ���� �л��� �迭
			
			for(int k=0;k<stuNum;k++) {
				stuArr[k]=k+1;
			} //�ε���
			
			for(int j=0;j<subStr;j++) {
				SubArr[j]= s.nextInt();
			} //���� �л� ��ȣ �Է¹ޱ�
			
			for(int j=0;j<subStr;j++) {			
				for(int k = 0 ; k<stuNum;k++) {					
					if(stuArr[k] != SubArr[j]) 
						continue;
					else
						stuArr[k]=0;	
				}
			}
			
			int index=0;
			for(int m=0;m<stuNum;m++) {
				if(stuArr[m] != 0) {
					unSubArr[index]=stuArr[m];
					index++;
				}
			}
			
			System.out.print("#"+(i+1) + " ");
			
			for(int n=0;n<stuNum-subStr;n++) {
				System.out.print(unSubArr[n]+" ");															
			}
			
			System.out.println();
		}
			
	}

}
