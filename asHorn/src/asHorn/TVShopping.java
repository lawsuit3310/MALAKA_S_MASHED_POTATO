package asHorn;

public class TVShopping extends ShoppingMall {

	TVShopping() {}
	TVShopping(String code, int total, String time){
		
		this.code = code;
		this.time = time;
		
		addTotal(total);
		
		System.out.println(this.code + "번 상품 " + this.total + "개 "+ 
		this.time + "에 판매 예정");
	}
	String time;
	
	public static void main(String[] args) {
		TVShopping ch1 = new TVShopping("523", 2, "3시 26분");

	}

}
