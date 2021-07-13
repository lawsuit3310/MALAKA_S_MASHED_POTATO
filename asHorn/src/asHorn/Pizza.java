package asHorn;

public class Pizza {
	

	Pizza(){}
	Pizza(String type){
		this.type = type;
	}
	Pizza(String type, int size){
		this(type);
		this.size = size;
	}
	
	private int size;
	private String type;
	
	void toPrint() {
		System.out.println("���� : " + type + "  ũ�� : " + size);
	}
	
	void SetType(String type) {
		this.type = type;
	}

	void SetSize(int size) {
		this.size = size;
	}
}
