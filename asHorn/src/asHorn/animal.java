package asHorn;

public class animal {

	animal(){}
	
	animal(String kind, String name, String toy , int age){
		this(kind, name, age);
		System.out.println(name +"��(��)" + this.toy + "�� �����մϴ�.");
		
	}
	
	animal( String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
		
		count += 1;
	}
	
	static int count = 0;
	
	protected String toy;
	protected String kind;
	protected String name;
	protected int age;
	
	
	void print() {
		System.out.println("�� ������ �̸��� "+name);
	}
	
	void printCount() {
		System.out.println("���� �� " + count + " ���� �ֽ��ϴ�.");
	}
	
	void print(String name) {
		System.out.println(kind + " " + name + " " + age);
	}
	
	void print(String name, int age) {
		System.out.println(name + " " + age);
	}
	
	void setToy(String toy) {
		this.toy = toy;
	}
	
	String getToy() {
		return toy;
	}
	
	
	//���� ����
	void setAge(int age) {
		this.age = age;
	}
	
	
	//���� �� ������
	int getAge() {
		return age;
	}
}
