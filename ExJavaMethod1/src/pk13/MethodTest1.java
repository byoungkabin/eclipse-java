package pk13;

import javax.swing.JOptionPane;

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("��2"));
		sum(num1,num2);

	}

	private static void sum(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("sum��" + (num1 + num2) + "�Դϴ�.");
	}

}
