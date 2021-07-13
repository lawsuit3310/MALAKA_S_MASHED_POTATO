package asHorn;

public class Taxi extends Car {
	Taxi(){
		System.out.println("자식 Taxi 생성자");
	}
	Taxi(string carName){
		System.out.println("자식 Taxi 생성자" + carName);
	}
	Taxi(String carName, String Color){
		this.carName = carName;
		this.Color = Color;
	}
	int pay = 3000;
	
	void payUP() {
		pay += 100;
		System.out.println("요금 : " + pay);
	}
	public static void main (string[] args){
		Taxi 봉고 = new Taxi(); 
		
	}
}
