package software0919;
import java.util.Scanner;

public class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0,num2=0;
		int total1=0,total2=0;
		int[] sum1= new int[3];
		int[] sum2= new int[3];
		
		Scanner s = new Scanner(System.in);

		num1=s.nextInt();
		num2=s.nextInt();
		
		//숫자분할과정
		
		for(int i=0;i<3;i++) {
			sum1[i]=num1%10;
			num1=num1/10;
		}
		for(int i=0;i<3;i++) {
			sum2[i]=num2%10;
			num2=num2/10;
		}
		
		total1=sum1[0]*100+sum1[1]*10+sum1[2]*1;
		total2=sum2[0]*100+sum2[1]*10+sum2[2]*1;

		if(total1<total2) {
			System.out.println(total2);
			
		}
		else {
			System.out.println(total1);
		}
		
		
		
		
	}

}
