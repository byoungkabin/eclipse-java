package pk18;

class Fruit {
	private String sort;
	private String season;
	
	public void Set1(String a, String b){
		this.sort=a; this.season=b;
	}	
	public void Disp1(){
		System.out.println("�з�  : "+ sort);
		System.out.println("����  : "+ season);
	}
}//of class

class Berry extends Fruit{
	private String size;
	private String name;
	
	public void Set2(String a, String b){
		this.size=a; this.name=b;
	}
	
	public void Disp2(){
		System.out.println("�̸�  : "+ name);
	    System.out.println("ũ��  : "+ size);
	}
}

class StrawBerry extends Berry {
	private String color;
	private int price;
	
	public void Set3(String a, int b) {
		this.color = a;
		this.price = b;
	}
	public void Disp3() {
		System.out.println("����  : "+ color);
	    System.out.println("����  : "+ price);		
	}
}
public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrawBerry sb = new StrawBerry();
		sb.Set1("Berry��", "����");
		sb.Set2("����", "��");
		sb.Set3("����", 5000);
		sb.Disp1();
		sb.Disp2();
		sb.Disp3();
	}

}
