package asHorn;

public class Book {
	
	Book(String name, int count){
		index++;
		bookName = name;
		this.count = count;
	}
	
	static int index = 0;
	String bookName;
	private int count;
	
	void printBookCount () {
		System.out.println(index + ". " + bookName + " : " + count + "��");
	}
	
	void rentalBook(int count){
		if (this.count < count)
			System.out.println("��� �����մϴ�. " + bookName +" ���� ��� : " + this.count + "��");
		else {
			this.count -= count;
			System.out.println(bookName + " : " + count + "�� ����");
			printBookCount();
		}
	}
	
	void returnBook(int count) {
		this.count += count;
		System.out.println(bookName+ " : " + count + "�� �ݳ� " + this.count + "�� ����.");
		printBookCount();
	}
}
