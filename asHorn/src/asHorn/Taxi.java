package asHorn;

public class Taxi extends Car {
	Taxi(){
		System.out.println("�ڽ� Taxi ������");
	}
	Taxi(string carName){
		System.out.println("�ڽ� Taxi ������" + carName);
	}
	Taxi(String carName, String Color){
		this.carName = carName;
		this.Color = Color;
	}
	int pay = 3000;
	
	void payUP() {
		pay += 100;
		System.out.println("��� : " + pay);
	}
	public static void main (string[] args){
		Taxi ���� = new Taxi(); 
		
	}
}
