package asHorn;

public class Cat extends animal {

	
	
	public static void main(String[] args) {
		
		animal Animal = new Cat(); // ���� -> ���� ����
		//Cat cat = new Animal();  ���� -> ���� �Ұ���
		
		//upCasting ���� <- ����
		Animal.name = "�ú����콺";
		Animal.print();
		
		//downCasting ���� <- ����
		Cat cat = (Cat)Animal;
		cat.print();
		
		cat.name = "���쿺";
		cat.print();
		Animal.print();
	}

}
