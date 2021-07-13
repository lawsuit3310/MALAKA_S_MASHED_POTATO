package asHorn;

//부모 클래스
class Father{

	String name;
	
	Father(){} //기본형 생성자
	
	Father (String name){
		this.name = name;
		System.out.println("Father 생성자 : " + this.name);
	}
}

//자식 클래스
public class myClass extends Father {
	
	myClass (String name){
		super(name); // 부모 생성자 호출
		System.out.println("myClass 생성자 : " + super.name);
	}
	
	public static void main (String[] args){
		myClass a = new myClass("홍길동");
	}
	

}
