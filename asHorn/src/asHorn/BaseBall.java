package asHorn;

public class BaseBall extends Sports {

	BaseBall(){}
	BaseBall(String name, int player){
		this.player = player;
		this.name = name;
	}
	
	public void rule() {
		System.out.println("�߱��� ���ݰ� ����� �̷����.");
	}
	public static void main(String[] args) {
		Sports baseball = new BaseBall("Baseball",9);
		System.out.println("��� ���� : " + baseball.getName());
		System.out.println("�ο� �� : " + baseball.getPlayer());
		System.out.print("��� ��Ģ : ");
		baseball.rule();

	}

}
