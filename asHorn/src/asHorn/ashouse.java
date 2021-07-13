package asHorn;

public class ashouse {

	public static void main(String[] args) {
		System.out.println("변수의 형변환");
		
		int a = 10;
		byte b = 1;
		
		if (a<b)
		{
			a = b;
		}
		else b = (byte)a;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
