package asHorn;

public class 리더_Main {
	public static void main(String[] args) {
		리더 student1 = new 리더("홍길동", "20500", true);
		리더 student2 = new 리더("임꺽정", "20500", false);
		
		student1.isLeader();
		student2.isLeader();
		student1.printStudent();
	}
}
