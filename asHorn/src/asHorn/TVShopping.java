package asHorn;

public class TVShopping extends ShoppingMall {

	TVShopping() {}
	TVShopping(String code, int total, String time){
		
		this.code = code;
		this.time = time;
		
		addTotal(total);
		
		System.out.println(this.code + "�� ��ǰ " + this.total + "�� "+ 
		this.time + "�� �Ǹ� ����");
	}
	String time;
	
	public static void main(String[] args) {
		TVShopping ch1 = new TVShopping("523", 2, "3�� 26��");

	}

}
