package asHorn;

import java.util.Scanner;

public class Day06_도서관_관리 {

	public static void main(String[] args) {
		

		Book b1 = new Book ("JAVA 교과서", 10);
		b1.printBookCount();
		
		Book b2 = new Book ("PYTHON 기초", 20 );
		b2.printBookCount();
		
		Book b3 = new Book ("세상의 중심에서 사랑을 외치는 고양이", 100 );
		b3.printBookCount();
		
		String a = new String();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하는 작업을 선택해주세요 [1: 대출 2: 반납]");
			int job = sc.nextInt();
			if (job ==1) {
				System.out.println("원하는 수량");
				int count = sc.nextInt();
				b3.rentalBook(count);
			}
			else if (job ==2) {
				System.out.println("반납할 수량");
				int count = sc.nextInt();
				b3.returnBook(count);
			}
			else {
				System.out.println("잘못된 값입니다.");
			}
		}

	}
}
