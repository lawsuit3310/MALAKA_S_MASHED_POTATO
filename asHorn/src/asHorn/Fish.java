package asHorn;

public class Fish extends animal {

	Fish(){}
	
	Fish(String kind, String name, int age, boolean isSwim){
		this.kind = kind;
		this.name = name;
		this.age = age;
		this.isSwim = isSwim;
	}
	
	boolean isSwim;
	
	void swim() {
		if (isSwim)
			System.out.println(super.name + "은 헤엄치고 있습니다.");
		else
			System.out.println(super.name + "은 헤엄치지 않고 있습니다.");
	}
	
	
	public static void main(String[] args) {
		Fish Nimo = new Fish("Shark", "Nimo", 2, true);
		
		Nimo.swim();

	}

}
