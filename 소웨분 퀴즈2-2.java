import java.util.*;

public class {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num= s.nextInt(); // 몇개의 단어를 입력할 지 입력받는다
		int count=-1; // 조건에 해당하는 단어가 몇개인지 카운트
		
		for(int i=0;i<num+1;i++) { //단어 개수 만큼 반복
			
			String str=s.nextLine(); //문자를 입력받는다
			
			String[] alpha = new String[26]; //알파벳 개수만큼 배열 생성
			String[] list=new String[100]; //나눈 문자를 저장 
			
			list=str.split(""); //문자열 분리
			int length=str.length(); //문자열 길이만큼 포문 반복 
			
			String temp;
			boolean check=true;
			int index=0;
			
			for(int j=0; j<length;j++) {
				
				temp=list[j];
				if(j==0) {
					alpha[index]=temp;
				}
				if(alpha[index].equals(temp))  //값이 비교 대상과 같다면 
					continue;
				else { //다르다면 ? 
					index++; //인덱스를 올린다 
					for(int k=0;k<index-1;k++) { 
						if(alpha[k].equals(temp)) {
							check=false;
							break;
						}
					}
					alpha[index]=temp;
				}			
			}
			if(check) { //만약에 check가 true 라면 ? 
				count++; //카운트 ++ 
			}			
		}
		System.out.print(count);
		s.close();		
	}
}
