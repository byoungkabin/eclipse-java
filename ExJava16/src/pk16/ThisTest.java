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
		R_speed= Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
		R_age= Integer.parseInt(JOptionPane.showInputDialog("로봇나이"));
		R_name=JOptionPane.showInputDialog("로봇이름");
		R_num=JOptionPane.showInputDialog("로봇번호");
		ThisTest obj = new ThisTest(R_speed,R_age,R_name,R_num);
		System.out.println("속도 : "+R_speed+" 나이 : "+R_age+"이름 : "+R_name+"번호 : "+R_num);
			

	}

}
