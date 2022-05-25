package pk09;

import javax.swing.JOptionPane;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat;
		int JumSu;
		char HakJum;
		
		dat = Integer.parseInt(JOptionPane.showInputDialog("값 입력 :"));
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("점수입력 :"));
		
		if(dat %10 ==0) {
			System.out.println(dat +"(은)는 10의 배수입니다.");
		}
		else {
			System.out.println(dat +"(은)는 10의 배수가 아닙니다.");
		}
		
		if(JumSu >= 90) {
			HakJum='A';
		}else if (JumSu >=80) {
			HakJum ='B';
		}else {
			HakJum='F';
			
		}
		System.out.println("취득한 학점은 "+ HakJum + "입니다.");

	
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
