package asHorn;

import java.util.Scanner;

public class Day07_animalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String kind;
		String name;
		String toy;
		int age;
		
		System.out.println("���� ����");
		kind = sc.next();
		
		System.out.println("���� �̸�");
		name = sc.next();
		
		System.out.println("���� ����");
		age = sc.nextInt();
		
		animal animal_1= new animal (kind, name, age);
		animal_1.printCount();
		animal_1.print(name);
		animal_1. print(name, age);
		
		
		System.out.println("=============================================================");
		System.out.println("���� ����");
		kind = sc.next();
		
		System.out.println("���� �̸�");
		name = sc.next();
		
		System.out.println("���� ����");
		age = sc.nextInt();
		
		System.out.println("�����ϴ� �峭��");
		toy = sc.next();
		
		animal animal_2 = new animal(kind, name, toy, age);
		
		animal_2.printCount();
		animal_2.setToy("����x");
		System.out.println(animal_2.getToy());
		
		animal_2.setAge(3);
		System.out.println(animal_2.getAge());
	}
}
