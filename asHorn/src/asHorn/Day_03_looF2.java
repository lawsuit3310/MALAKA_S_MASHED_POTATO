package asHorn;

import java.util.Scanner;

public class Day_03_looF2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		while (true) {
			System.out.println("숫자를 입력해주세요 : ");
			int N = sc.nextInt();
			int even_sum = 0, odd_sum = 0;
			for (int i =0; i<=N; i++ ) {
				if (i%2 == 0)
					even_sum += i;
				else
					odd_sum += i;
			}
			System.out.println("1부터 "+ N+" 까지의 짝수 합은 "+ even_sum+"이며, 홀수 합은 "+odd_sum+"입니다.");
		}		

	}

}
