package asHorn;

public class string {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		
		if (str1==str2)//주소가 같은지 물어봄
			System.out.println("주소 동일");
		else
			System.out.println("주소 동일하지않음");
		if(str1.equals(str2))//값이 동일한지 물어봄
			System.out.println("값 동일");
		else
			System.out.println("값 동일하지않음");
		
		// 같은 값을 가지는 변수들은 같은 주소를 가르킴.
		
		String str3= new String("Java");
		String str4= new String("Java");

		if(str3==str4)//뉴로 선언했기 때문에 각각 다른 메모리를 사용, 주소가 같지 않음
			System.out.println("주소 동일");
		else
			System.out.println("주소 동일하지않음");
		if(str3.equals(str4))
			System.out.println("값 동일");
		else
			System.out.println("값 동일하지않음");
	}

}
