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
		System.out.println(index + ". " + bookName + " : " + count + "권");
	}
	
	void rentalBook(int count){
		if (this.count < count)
			System.out.println("재고가 부족합니다. " + bookName +" 현재 재고량 : " + this.count + "권");
		else {
			this.count -= count;
			System.out.println(bookName + " : " + count + "권 대출");
			printBookCount();
		}
	}
	
	void returnBook(int count) {
		this.count += count;
		System.out.println(bookName+ " : " + count + "권 반납 " + this.count + "권 있음.");
		printBookCount();
	}
}
