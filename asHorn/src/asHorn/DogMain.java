package asHorn;

public class DogMain {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		d1.age = 1;
		d1.bread = "Çªµé";
		d1.color = "¿À·»Áö";
		
		d1.toPrint();
		
		Dog d2 = new Dog();
		
		d2.age = 4;
		d2.bread = "ºÒµ¶";
		d2.color = "°ËÁ¤";

		d2.toPrint();
		
		d1.barking();
		d2.hungry();
		d1.sleeping();
	}

}
