package pk14;

public class RecuTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res, x=3;
		System.out.println("����� main()�Լ� �Դϴ�.");
		res = Recur1(x);
		
		System.out.println("1~3 ���� �� =>" +res + "\n");
		System.out.println("main()�Լ��� �ٽ� ���ƿԽ��ϴ�.");
		
	}

	private static int Recur1(int a) {
		// TODO Auto-generated method stub
		int gop;
		System.out.println(a);
		if(a==1) return(1);
		else gop = a*Recur1(a-1);
		return(gop);

	}

}
