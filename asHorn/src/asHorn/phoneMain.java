package asHorn;

import java.util.Scanner;

public class phoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String model;
		int price;
		
		System.out.println("�ڵ��� ���� �Է�");
		model = sc.nextLine();
		System.out.println("�ڵ��� ���� �Է�");
		price = sc.nextInt();
		
		phone phone_1 = new phone(model, price);
		phone_1.toPrint();
		phone_1.printTotal();
		
		System.out.println("�ڵ��� ���� �Է�");
		model = sc.next();
		System.out.println("�ڵ��� ���� �Է� (���� : ����)");
		price = sc.nextInt();
		
		phone phone_2 = new phone(model, price);
		phone_2.toPrint();
		phone_2.printTotal();
	}

}
