package asHorn;

public class Day04_loop05 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j<=5;j++) {
				System.out.print("*");
				if (j==2)
					break;
			}
			if (i==3)
				continue;
			System.out.println("=");
		}
	}
}
