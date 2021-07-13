package asHorn;

public class 리더 extends 학생정보{
	boolean leader = false;
	리더 (String name, String hakbun, boolean leader){
		this.name = name;
		this.hakbun = hakbun;
		this.leader = leader;
	}
	
	boolean isLeader() {
		if(this.leader)
			System.out.println(name + "은 리더입니다.");
		else
			System.out.println(name + "은 리더가 아닙니다.");
		
		return true;	
	}
	
}
