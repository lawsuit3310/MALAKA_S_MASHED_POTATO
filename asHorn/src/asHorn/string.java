package asHorn;

public class string {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		
		if (str1==str2)//�ּҰ� ������ ���
			System.out.println("�ּ� ����");
		else
			System.out.println("�ּ� ������������");
		if(str1.equals(str2))//���� �������� ���
			System.out.println("�� ����");
		else
			System.out.println("�� ������������");
		
		// ���� ���� ������ �������� ���� �ּҸ� ����Ŵ.
		
		String str3= new String("Java");
		String str4= new String("Java");

		if(str3==str4)//���� �����߱� ������ ���� �ٸ� �޸𸮸� ���, �ּҰ� ���� ����
			System.out.println("�ּ� ����");
		else
			System.out.println("�ּ� ������������");
		if(str3.equals(str4))
			System.out.println("�� ����");
		else
			System.out.println("�� ������������");
	}

}
