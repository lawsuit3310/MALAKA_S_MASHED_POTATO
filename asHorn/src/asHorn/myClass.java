package asHorn;

//�θ� Ŭ����
class Father{

	String name;
	
	Father(){} //�⺻�� ������
	
	Father (String name){
		this.name = name;
		System.out.println("Father ������ : " + this.name);
	}
}

//�ڽ� Ŭ����
public class myClass extends Father {
	
	myClass (String name){
		super(name); // �θ� ������ ȣ��
		System.out.println("myClass ������ : " + super.name);
	}
	
	public static void main (String[] args){
		myClass a = new myClass("ȫ�浿");
	}
	

}
