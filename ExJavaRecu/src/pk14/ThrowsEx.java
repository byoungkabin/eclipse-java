package pk14;
public class ThrowsEx {
	
	public static void fun() throws Exception{
		
		try{
			System.out.println("fun()메소드");
			throw new Exception();
		}catch(RuntimeException e){
			System.out.println("예외발생");
		}finally{
		    System.out.println("finally 문장안");
		}
	}//of fun()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			fun();
		}catch(Exception e){
			System.out.println("main()메소드 catch문");
		}
	}//of main()
}//of class
