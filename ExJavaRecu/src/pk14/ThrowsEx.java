package pk14;
public class ThrowsEx {
	
	public static void fun() throws Exception{
		
		try{
			System.out.println("fun()�޼ҵ�");
			throw new Exception();
		}catch(RuntimeException e){
			System.out.println("���ܹ߻�");
		}finally{
		    System.out.println("finally �����");
		}
	}//of fun()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			fun();
		}catch(Exception e){
			System.out.println("main()�޼ҵ� catch��");
		}
	}//of main()
}//of class
