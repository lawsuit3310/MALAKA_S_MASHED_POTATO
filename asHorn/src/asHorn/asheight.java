package asHorn;

import java.util.Scanner;

public class asheight {

	public static void main(String[] args) {
		int a = 0, b = 0; String op   ;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("숫자 : ");
			a = sc.nextInt();
		
			System.out.println("숫자 : ");
			b = sc.nextInt();
		
			System.out.println("연산 방식");
			op = sc.next();
		
			if(a==0) {
				System.out.println("프로그램 종료");
				break;
			}
		
			if(op.equals("+")||op.equals("더하기"))
				System.out.println(a + op + b + "=" + (a+b));
			else if(op.equals("-")||op.equals("빼기"))
				System.out.println(a + " " + op + b + "=" + (a-b));
			else if(op.equals("*")||op.equals("X")||op.equals("곱하기")) 
				System.out.println(a + op + b + "=" + (a*b));
			else if(op.equals("/")||op.equals("나누기"))
				System.out.println(a + op + b + "=" + (a/b));
			
			char opp = op.charAt(0);
			
			switch (opp) {
			case '+':
				System.out.println(a + op + b + "=" + (a+b));
				break;
			case '-':
				System.out.println(a + op + b + "=" + (a-b));
				break;
			case '*':
				System.out.println(a + op + b + "=" + (a*b));
				break;
			case '/':
				System.out.println(a + op + b + "=" + (a/b));
				break;
			default:
				System.out.println("올바른 연산이 아닙니다.");
				break;
			}

		}
	}
}
