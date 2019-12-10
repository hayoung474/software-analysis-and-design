package Manage;

public class AdminMenuEdit {
	
	public String LoginedGrade;
	public String LoginedName;
	public boolean check;
	
	public void SetPerm(String name, String grade){
		LoginedGrade=grade;
		LoginedName=name;
		if(grade.equals("ªÁ¿Â")) {
			check=true;
		}
		else {
			check=false;
		}
	}

}
