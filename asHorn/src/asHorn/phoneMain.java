package asHorn;

import java.util.Scanner;

public class phoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String model;
		int price;
		
		System.out.println("핸드폰 기종 입력");
		model = sc.nextLine();
		System.out.println("핸드폰 가격 입력");
		price = sc.nextInt();
		
		phone phone_1 = new phone(model, price);
		phone_1.toPrint();
		phone_1.printTotal();
		
		System.out.println("핸드폰 기종 입력");
		model = sc.next();
		System.out.println("핸드폰 가격 입력 (단위 : 만원)");
		price = sc.nextInt();
		
		phone phone_2 = new phone(model, price);
		phone_2.toPrint();
		phone_2.printTotal();
	}

}
