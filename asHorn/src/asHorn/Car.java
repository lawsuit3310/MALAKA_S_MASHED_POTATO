package asHorn;

public class Car {
	
	Car(){
		System.out.println("부모 car 생성자");
	}
	
	Car(String carName, String Color){
		this.carName = carName;
		this.Color = Color;
	}
	
	String carName;
	String Color = "검정색";
	int velocity = 0;
	
	void Accelerator() {
		velocity += 5;
		System.out.println(carName + " 의 현재속도 : " + velocity);
	}
	void Break() {
		velocity -= 5;
		System.out.println(carName + " 의 현재속도 : " + velocity);
	}
	void Accelerator(int loof) {
		for (int i=0; i < loof; i++)
			velocity += 5;
		System.out.println(carName + " 의 현재속도 : " + velocity);
	}
	void Break(int loof) {
		for (int i = 0; i < loof; i++)	
			velocity -= 5;
		System.out.println(carName + " 의 현재속도 : " + velocity);
	}
	
	void print() {
		System.out.println(carName + " " + Color);
	}
}
