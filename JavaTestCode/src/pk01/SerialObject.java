package pk01;

import java.io.Serializable;

public class SerialObject implements Serializable {
	
	//겍체 직렬화를 위한 Serializalbe 인터페이스 상속
	
	private String name;
	private String detp;
	private String title;
	
	public SerialObject(String name, String detp, String title) {
		super();
		this.name = name;
		this.detp = detp;
		this.title = title;
	}

	@Override
	public String toString() {
		return "SerialObject [name=" + name + ", detp=" + detp + ", title=" + title + "]";
	}
	
	
}
