package pk09;

import javax.swing.JOptionPane;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat;
		int JumSu;
		char HakJum;
		
		dat = Integer.parseInt(JOptionPane.showInputDialog("�� �Է� :"));
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("�����Է� :"));
		
		if(dat %10 ==0) {
			System.out.println(dat +"(��)�� 10�� ����Դϴ�.");
		}
		else {
			System.out.println(dat +"(��)�� 10�� ����� �ƴմϴ�.");
		}
		
		if(JumSu >= 90) {
			HakJum='A';
		}else if (JumSu >=80) {
			HakJum ='B';
		}else {
			HakJum='F';
			
		}
		System.out.println("����� ������ "+ HakJum + "�Դϴ�.");

	
		switch (JumSu) {
		case 90:
			System.out.println("9999");
			break;
		case 80:
			System.out.println("88888");
			break;
		default:
			System.out.println("ttt");
			break;
		}

	}
}
