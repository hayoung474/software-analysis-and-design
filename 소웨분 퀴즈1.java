package hehehehehe;

import java.util.Scanner;

public class {
	
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int sum=a*b*c;
		int[] count = new int[10]; //숫자 카운트 저장
		
		while(sum!=0)
		{
			if(sum%10==0) {
				count[0]++;
				sum/=10;
			}
			else if(sum%10==1) {
				count[1]++;
				sum/=10;
			}
			else if(sum%10==2) {
				count[2]++;
				sum/=10;
			}
			else if(sum%10==3) {
				count[3]++;
				sum/=10;
			}
			else if(sum%10==4) {
				count[4]++;
				sum/=10;
			}
			else if(sum%10==5) {
				count[5]++;
				sum/=10;
			}
			else if(sum%10==6) {
				count[6]++;
				sum/=10;
			}
			else if(sum%10==7) {
				count[7]++;
				sum/=10;
			}
			else if(sum%10==8) {
				count[8]++;
				sum/=10;
			}
			else if(sum%10==9) {
				count[9]++;
				sum/=10;
			}	
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(count[i]);
		}
	}

}
