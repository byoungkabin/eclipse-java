package pk16;
import javax.swing.JOptionPane;
public class ThisTest {
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	public ThisTest(){
		this(0,0,"","");
	}
	public ThisTest(int Age,String RobotName,String RobotNum){
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	
	public ThisTest(int Speed,int Age,String RobotName,String RobotNum){
		this.Speed=Speed;
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	public void Move(){
		Speed += 20;
	}
    public void Stop(){
		Speed = 0;	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R_speed;
		int R_age;
		String R_name;
		String R_num;
		R_speed= Integer.parseInt(JOptionPane.showInputDialog("�κ��ӵ�"));
		R_age= Integer.parseInt(JOptionPane.showInputDialog("�κ�����"));
		R_name=JOptionPane.showInputDialog("�κ��̸�");
		R_num=JOptionPane.showInputDialog("�κ���ȣ");
		ThisTest obj = new ThisTest(R_speed,R_age,R_name,R_num);
		System.out.println("�ӵ� : "+R_speed+" ���� : "+R_age+"�̸� : "+R_name+"��ȣ : "+R_num);
			

	}

}
