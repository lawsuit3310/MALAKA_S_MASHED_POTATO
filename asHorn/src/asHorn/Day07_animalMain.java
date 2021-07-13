package asHorn;

import java.util.Scanner;

public class Day07_animalMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String kind;
		String name;
		String toy;
		int age;
		
		System.out.println("동물 종류");
		kind = sc.next();
		
		System.out.println("동물 이름");
		name = sc.next();
		
		System.out.println("동물 나이");
		age = sc.nextInt();
		
		animal animal_1= new animal (kind, name, age);
		animal_1.printCount();
		animal_1.print(name);
		animal_1. print(name, age);
		
		
		System.out.println("=============================================================");
		System.out.println("동물 종류");
		kind = sc.next();
		
		System.out.println("동물 이름");
		name = sc.next();
		
		System.out.println("동물 나이");
		age = sc.nextInt();
		
		System.out.println("좋아하는 장난감");
		toy = sc.next();
		
		animal animal_2 = new animal(kind, name, toy, age);
		
		animal_2.printCount();
		animal_2.setToy("오우쉣");
		System.out.println(animal_2.getToy());
		
		animal_2.setAge(3);
		System.out.println(animal_2.getAge());
	}
}
