package asHorn;

public class student_info {
	
	student_info(){
		count++;
	}
	
	static int count = 0;
	static String school = "Robot";
	String name ;
	int grade;
	
	public void print(){
		System.out.println(count + " ��° �л� " + school + " " +name + " : " + grade + "�г�");
		
	}
}
