package swing;

public class ArrayTest {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = a;

		System.out.println("A的值");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		System.out.println("=========");

		System.out.println("B的值");
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);
		
		System.out.println("=========");
		
		a[0] = 555;
		
		System.out.println("A的值");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println("B的值");
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);

	}

}
