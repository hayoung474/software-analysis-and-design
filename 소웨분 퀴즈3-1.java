package quiz333333;

import java.util.Scanner;

public class {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
		int testCase=0;
		testCase=s.nextInt(); 
		int [][] arr = new int [testCase][8]; //��� 0�� �ϴ��� 
		
		int temp;
		
		for(int t=0;t<testCase;t++) {
					
			int money=s.nextInt(); //���� �Է��Ѵ�
				
			if(money>=50000) {
				temp=money/50000;
				arr[t][0]=temp; 
				money=money%50000; 
				
				
			} //���࿡ ���� 5�����̳����� ������ �����Ѵ� 
			
			if(money>=10000) {
				temp=money/10000;
				arr[t][1]=temp; 
				money=money%10000; 
				
				
			} //���� ���� 3������ ������ ������ �����Ѵ� 
			
			if(money>=5000) {
				temp=money/5000;
				arr[t][2]=temp; 
				money=money%5000; 
				
			
			}
			
			if(money>=1000) {
				temp=money/1000;
				arr[t][3]=temp; 
				money=money%1000; 
				
			}
			
			if(money>=500) {
				temp=money/500;
				arr[t][4]=temp; 
				money=money%500;
				
			}
			
			if(money>=100) {
				temp=money/100;
				arr[t][5]=temp; 
				money=money%100; 
				
			}
			
			if(money>=50) {
				temp=money/50;
				arr[t][6]=temp;  //�迭�� ������ �ϴµ����̾� 
				money=money%50; 
				
			}
		
			if(money>=10) {
				temp=money/10;
				arr[t][7]=temp; 
				money=money%10;
				
			}
							
		}
		
		//���
		for(int j=0;j<testCase;j++) {
			System.out.println("#"+(j+1));
			for(int i=0;i<8;i++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.print("\n");
		}
			
		
		
	}

}
