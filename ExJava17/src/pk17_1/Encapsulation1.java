package pk17_1;

public class Encapsulation1 {

	private int Side;
	private int Height;
	
	public Encapsulation1() {
		this.Side = 0;
		this.Height = 0;
	}
	public int Cal_Area(int side, int height) {
		// TODO Auto-generated method stub
		this.Side = side;
		this.Height = height;
		return (Side * Height);
	}

}
