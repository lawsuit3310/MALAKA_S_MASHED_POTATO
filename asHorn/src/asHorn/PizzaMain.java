package asHorn;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza pz1 = new Pizza();
		Pizza pz2 = new Pizza("��������");
		Pizza pz3 = new Pizza("�Ұ��",12);
		
		pz1.SetType("���۽�����");
		pz1.SetSize(12);
		pz2.SetSize(24);
		
		
		pz1.toPrint();
		pz2.toPrint();
		pz3.toPrint();

	}

}
