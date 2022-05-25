package pk03;

public class IntDataTypeTest {

	public static void main(String[] args) {
		int a, b, c;
		a=10;
		b=20;
		c=3;
		char c1='A';
		char c2='B';
		
		System.out.println("++a -> " + (++a));
		System.out.println("a++ -> " + (a++));
		System.out.println("a -> " + (a));		
		System.out.println("c++ -> " + (c++));
		System.out.println("++a + b++ -> " + (++a + b++));
		System.out.println("b -> " + (b));
		
		boolean c3 = true || true && false;
		System.out.println(c3);

	}

}
