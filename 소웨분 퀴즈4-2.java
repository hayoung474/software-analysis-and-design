package quiz4;

import java.util.Scanner;
public class quiz4 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int testCase=s.nextInt();
		int[] result=new int[testCase];
		
		for(int test=0;test<testCase;test++) {
			int count=1;
			int n=s.nextInt();
			int sum=0;
			int [] checkArr= new int[10];
			
			while(true) {//���� �����Ҷ����� �ݺ��Ѵ� 
				
				sum=sum+n;
				
				//�Է¹��� ���� �����Ѵ�.
				String temp=Integer.toString(sum); 
				String[] temparr=temp.split("");
				int[] num=new int [temparr.length];
				for (int i = 0; i < temparr.length; i++)
					num[i]=Integer.parseInt(temparr[i]);
				
				//�迭 �� ����غ���
				for(int a=0;a<num.length;a++) {
					System.out.print(num[a]+" ");
				}
				System.out.println();

				//�迭��ȸ
				for(int j=0;j<num.length;j++) 
				{
					for(int k=0;k<10;k++) 
					{
						if(num[j]==k) 
							checkArr[k]=1;//1�� �ʱ�ȭ
					}
				} 
				
				
		
				
				//���ǰ˻�
				if((checkArr[0]==1)&&(checkArr[1]==1)&&(checkArr[2]==1)&&(checkArr[3]==1)&&(checkArr[4]==1)&&
						(checkArr[5]==1)&&(checkArr[6]==1)&&(checkArr[7]==1)&&(checkArr[8]==1)&&(checkArr[9]==1)){
						break;
				}
				count++;	
			}
			//result[test]=count;		
			result[test]=sum;		
		}
		
		for(int j=0;j<testCase;j++) {
			System.out.print("#"+(j+1)+" ");
			System.out.print(result[j]);
			System.out.print("\n");
			
		}
		s.close();
	}

}
