package asHorn;

public class Dog {

	int age;
	String bread;
	String color;
	
	void barking() {
		System.out.println(bread + " is barking");
	}
	void hungry() {
		System.out.println(bread + " is hungry");
	}
	void sleeping() {
		System.out.println(bread + " is sleeping");
	}
	void toPrint() {
		System.out.println("(" + bread + ", "+ age + ", "
				+ color + ")");
	}
}
