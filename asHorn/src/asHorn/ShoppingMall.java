package asHorn;

public class ShoppingMall {
	
	ShoppingMall(){}
	protected ShoppingMall(String code){
		this.code = code;
		System.out.println("잔고 : " + total + "개");
	}
	
	String code;
	int total = 0;
	
	void addTotal(int Quantity ) {
		total += Quantity;
		System.out.println(Quantity + "개 입고. 잔여 수량: " + total + "개");
	}
	void subTotal(int Quantity) {
		total -= Quantity;
		System.out.println(Quantity + "개 출고. 잔여 수량: " + total + "개");
	}
	public static void main(String[] args) {
	}
	
}
