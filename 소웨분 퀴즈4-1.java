package quiz4;
import java.util.Scanner;
public class {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int testCase=s.nextInt();
		int[] result=new int[testCase];
		
		for(int test=0;test<testCase;test++) {
			int nowTest=0;
			nowTest=s.nextInt();
			int index[] = new int [101];
			//배열에 해당하는 인덱스
			
			for(int i=0;i<10;i++) {
				int temp=s.nextInt();
				index[temp]++;
				
			}
			//for(int j=0;j<101;j++) {
			//	System.out.println(index[j]);
			//}
			
			int max=0; //최고 빈도수를 체크하기위해서
			int scoreIndex=0;

			for(int i=0;i<101;i++) {
				if(index[i]>=max) {
					
					max=index[i];
					scoreIndex=i;
					
					
				}
				if(index[i]==index[scoreIndex]) {
					max=index[scoreIndex]>index[i]?index[scoreIndex]:index[i];
				}
				else {
					continue;
				}
				
				
			}
			result[nowTest-1]=scoreIndex;
			//System.out.println(scoreIndex);
		}
		for(int j=0;j<testCase;j++) {
			System.out.print("#"+(j+1)+" ");
			System.out.print(result[j]);
			System.out.print("\n");
		}
		s.close();
	}

}
