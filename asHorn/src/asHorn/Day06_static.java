package asHorn;

public class Day06_static {

	public static void main(String[] args) {
		student_info a = new student_info();
		a.grade = 1; a.name = "Áß";
		a.print();
		
		student_info b = new student_info();
		b.grade = 2; b.name = "ºØ";
		b.school = "¹«Çö";
		b.print();
		
		student_info c = new student_info();
		c.grade = 3; c.name = "ÀÌ";
		c.school = "¿ìÈï";
		c.print();
	}

}
