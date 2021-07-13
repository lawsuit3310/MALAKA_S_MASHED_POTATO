package asHorn;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("Sonata", "White");
		Car car2 = new Car("Truck", "Green");
		
		car1.Accelerator(2);
		car1.Accelerator();
		
		car1.Break();
		
		car1.print();
		
		car2.Accelerator(2);
		car2.Accelerator();
		
		car2.print();
	}

}
