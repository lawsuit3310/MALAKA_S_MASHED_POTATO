package asHorn;

import java.util.Scanner;

public class Day06_������_���� {

	public static void main(String[] args) {
		

		Book b1 = new Book ("JAVA ������", 10);
		b1.printBookCount();
		
		Book b2 = new Book ("PYTHON ����", 20 );
		b2.printBookCount();
		
		Book b3 = new Book ("������ �߽ɿ��� ����� ��ġ�� �����", 100 );
		b3.printBookCount();
		
		String a = new String();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ϴ� �۾��� �������ּ��� [1: ���� 2: �ݳ�]");
			int job = sc.nextInt();
			if (job ==1) {
				System.out.println("���ϴ� ����");
				int count = sc.nextInt();
				b3.rentalBook(count);
			}
			else if (job ==2) {
				System.out.println("�ݳ��� ����");
				int count = sc.nextInt();
				b3.returnBook(count);
			}
			else {
				System.out.println("�߸��� ���Դϴ�.");
			}
		}

	}
}
