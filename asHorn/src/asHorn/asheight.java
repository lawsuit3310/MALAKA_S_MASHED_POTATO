package asHorn;

import java.util.Scanner;

public class asheight {

	public static void main(String[] args) {
		int a = 0, b = 0; String op   ;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("���� : ");
			a = sc.nextInt();
		
			System.out.println("���� : ");
			b = sc.nextInt();
		
			System.out.println("���� ���");
			op = sc.next();
		
			if(a==0) {
				System.out.println("���α׷� ����");
				break;
			}
		
			if(op.equals("+")||op.equals("���ϱ�"))
				System.out.println(a + op + b + "=" + (a+b));
			else if(op.equals("-")||op.equals("����"))
				System.out.println(a + " " + op + b + "=" + (a-b));
			else if(op.equals("*")||op.equals("X")||op.equals("���ϱ�")) 
				System.out.println(a + op + b + "=" + (a*b));
			else if(op.equals("/")||op.equals("������"))
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
				System.out.println("�ùٸ� ������ �ƴմϴ�.");
				break;
			}

		}
	}
}
