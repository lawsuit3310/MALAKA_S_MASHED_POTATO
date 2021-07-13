package asHorn;

public class Cat extends animal {

	
	
	public static void main(String[] args) {
		
		animal Animal = new Cat(); // 상위 -> 하위 가능
		//Cat cat = new Animal();  하위 -> 상위 불가능
		
		//upCasting 상위 <- 하위
		Animal.name = "시벨리우스";
		Animal.print();
		
		//downCasting 하위 <- 상위
		Cat cat = (Cat)Animal;
		cat.print();
		
		cat.name = "응우옌";
		cat.print();
		Animal.print();
	}

}
