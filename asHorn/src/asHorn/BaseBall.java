package asHorn;

public class BaseBall extends Sports {

	BaseBall(){}
	BaseBall(String name, int player){
		this.player = player;
		this.name = name;
	}
	
	public void rule() {
		System.out.println("야구는 공격과 수비로 이루어짐.");
	}
	public static void main(String[] args) {
		Sports baseball = new BaseBall("Baseball",9);
		System.out.println("경기 종목 : " + baseball.getName());
		System.out.println("인원 수 : " + baseball.getPlayer());
		System.out.print("경기 규칙 : ");
		baseball.rule();

	}

}
