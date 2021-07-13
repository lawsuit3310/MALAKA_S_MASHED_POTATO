package asHorn;

public class animal {

	animal(){}
	
	animal(String kind, String name, String toy , int age){
		this(kind, name, age);
		System.out.println(name +"은(는)" + this.toy + "를 좋아합니다.");
		
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
		System.out.println("이 동물의 이름은 "+name);
	}
	
	void printCount() {
		System.out.println("현재 총 " + count + " 마리 있습니다.");
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
	
	
	//나이 저장
	void setAge(int age) {
		this.age = age;
	}
	
	
	//나이 값 가져옴
	int getAge() {
		return age;
	}
}
