package pk24;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
		
		Vector<Object> vec = new Vector<Object>(30);
		
		obj = 10;
		
		vec.addElement(obj);
		System.out.println("�뷮�� #1 : " + vec.capacity());
		System.out.println("ũ��� #1 : " + vec.size());
		
		obj = "hi ";
		vec.addElement(obj);
		System.out.println("�뷮�� #2 : " + vec.capacity());
		System.out.println("ũ��� #2 : " + vec.size());
	
		obj = "Nice Day ";
		vec.addElement(obj);
		System.out.println("�뷮�� #3 : " + vec.capacity());
		System.out.println("ũ��� #3 : " + vec.size());
	}

}
