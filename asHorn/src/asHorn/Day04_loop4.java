package asHorn;

import java.util.Scanner;

public class Day04_loop4 {

	public static void main(String[] args) {
		int sum = 0;
		int N ;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("N: ");
		N=sc.nextInt();
		
		while(i<=N) {
			if(i%2==0) {
				sum += i;
				System.out.print("+" + i);
			}
			else {
				sum -= i;
				System.out.print("-"+i);
			}
			i++;
		}
		System.out.println(" = " + sum);
	}

}
