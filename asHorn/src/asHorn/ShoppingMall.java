package asHorn;

public class ShoppingMall {
	
	ShoppingMall(){}
	protected ShoppingMall(String code){
		this.code = code;
		System.out.println("�ܰ� : " + total + "��");
	}
	
	String code;
	int total = 0;
	
	void addTotal(int Quantity ) {
		total += Quantity;
		System.out.println(Quantity + "�� �԰�. �ܿ� ����: " + total + "��");
	}
	void subTotal(int Quantity) {
		total -= Quantity;
		System.out.println(Quantity + "�� ���. �ܿ� ����: " + total + "��");
	}
	public static void main(String[] args) {
	}
	
}
