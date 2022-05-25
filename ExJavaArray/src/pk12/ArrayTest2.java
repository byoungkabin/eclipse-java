package pk12;

import javax.swing.JOptionPane;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"a123","b123","c123","d123","e123"};
		String res="";
		
		
		for (int i=0; i<str.length; i++)
			res =res +str[i]+"\n";
		System.out.println(res);
		JOptionPane.showMessageDialog(null,"배열 원소의 값 " + res);
	}

}
