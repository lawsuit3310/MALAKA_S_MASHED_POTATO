package asHorn;

public class Day04_Loop3 {

	public static void main(String[] args) {
			System.out.println("巩力1======================");
			for(int i =0;i<3;i++) {
				for(int j =1;j<4;j++)
					System.out.printf("%d",j);
				System.out.println("");
			}
				System.out.println("巩力2======================");
				for(int i =1;i<4;i++) {
					for(int j =1;j<5;j++)
						System.out.printf("%d",i);
					System.out.println("");
			}
				System.out.println("巩力3======================");
				for(int i =1;i<=4;i++) {
					for(int j =1;j<=i;j++)
						System.out.printf("%d",j);
					System.out.println("");
			}
				System.out.println("巩力4======================");
				for(int i =4;i>0;i--) {
					for(int j =i;j>0;j--)
						System.out.printf("%d",j);
					System.out.println("");
			}
				System.out.println("巩力5======================");
				for(int i =4;i>1;i--) {
					for(int j =i;j>0;j--)
						System.out.print("*");
					System.out.println("");
			}
		}
}
