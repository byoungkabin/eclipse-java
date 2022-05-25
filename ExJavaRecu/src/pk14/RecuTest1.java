package pk14;

public class RecuTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res, x=3;
		System.out.println("여기는 main()함수 입니다.");
		res = Recur1(x);
		
		System.out.println("1~3 수의 곱 =>" +res + "\n");
		System.out.println("main()함수로 다시 돌아왔습니다.");
		
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
