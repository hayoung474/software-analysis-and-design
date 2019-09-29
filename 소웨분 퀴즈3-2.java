package quiz333302;
import java.util.Scanner;

public class {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int testCase=0;
		testCase=s.nextInt(); 
		
		for(int i=0;i<testCase;i++) {
			
			int stuNum=s.nextInt(); //학생이 몇명인지 입력받기
			int subStr=s.nextInt(); //몇명의 학생이 제출했는지 입력받기
			
			int [] stuArr=new int [stuNum]; //학생 수 만큼 배열 생성
			int [] SubArr = new int [subStr]; //제출한 학생의 배열 
			int [] unSubArr = new int [stuNum-subStr]; //제출 안한 학생의 배열
			
			for(int k=0;k<stuNum;k++) {
				stuArr[k]=k+1;
			} //인덱싱
			
			for(int j=0;j<subStr;j++) {
				SubArr[j]= s.nextInt();
			} //제출 학생 번호 입력받기
			
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
