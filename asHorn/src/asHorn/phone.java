package asHorn;

public class phone {

	phone (String model, int price){
		this.model = model;
		this.price = price;
		total += 1;
	}
	
	private String model;
	private int price;
	private static int total;
	
	void toPrint() {
		
		System.out.println(price+ "만원 짜리 " + model + " 스마트폰");
	}
	void printTotal() {
		System.out.println(total);
	}
}
