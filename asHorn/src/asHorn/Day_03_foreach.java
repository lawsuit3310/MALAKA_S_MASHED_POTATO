package asHorn;

public class Day_03_foreach {

	public static void main(String[] args) {
		int a [] = new int[] {1,2,3,4,5};
		double sum = 0.0;
		
		for (int i:a)
			System.out.println(i);
		
		float b [] = new float []{1.3f,2.3f,4.2f};;
		for (float j:b) {
			System.out.println(j);
						sum += j;
		}
		System.out.println(sum);
		
		String [] c = {"seoul","robot","high","school"};
		for (String k:c) {
			k = "TTTT";
			System.out.println(k);
		}
		for (String k:c) 
			System.out.println(k);

	}

}
