package asHorn;

public class Car {
	
	Car(){
		System.out.println("�θ� car ������");
	}
	
	Car(String carName, String Color){
		this.carName = carName;
		this.Color = Color;
	}
	
	String carName;
	String Color = "������";
	int velocity = 0;
	
	void Accelerator() {
		velocity += 5;
		System.out.println(carName + " �� ����ӵ� : " + velocity);
	}
	void Break() {
		velocity -= 5;
		System.out.println(carName + " �� ����ӵ� : " + velocity);
	}
	void Accelerator(int loof) {
		for (int i=0; i < loof; i++)
			velocity += 5;
		System.out.println(carName + " �� ����ӵ� : " + velocity);
	}
	void Break(int loof) {
		for (int i = 0; i < loof; i++)	
			velocity -= 5;
		System.out.println(carName + " �� ����ӵ� : " + velocity);
	}
	
	void print() {
		System.out.println(carName + " " + Color);
	}
}
