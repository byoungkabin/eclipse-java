package pk17;

import javax.swing.JOptionPane;

import pk17_1.Encapsulation1;

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side;
		int height;
		int Area;
		String str="";
		side = Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height = Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		Encapsulation1 obj = new Encapsulation1();
		
		Area = obj.Cal_Area(side,height);
		str = "사각형의 넓이는 " + Area +"입니다.";
		System.out.println(str);
		JOptionPane.showMessageDialog(null,str);
				

	}

}
