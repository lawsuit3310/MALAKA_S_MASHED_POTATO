package asHorn;

import java.util.Scanner;

public class Day_03_looF2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		while (true) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			int N = sc.nextInt();
			int even_sum = 0, odd_sum = 0;
			for (int i =0; i<=N; i++ ) {
				if (i%2 == 0)
					even_sum += i;
				else
					odd_sum += i;
			}
			System.out.println("1���� "+ N+" ������ ¦�� ���� "+ even_sum+"�̸�, Ȧ�� ���� "+odd_sum+"�Դϴ�.");
		}		

	}

}
