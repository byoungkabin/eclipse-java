package pk01;

import java.io.Serializable;

public class SerialObject implements Serializable {
	
	//��ü ����ȭ�� ���� Serializalbe �������̽� ���
	
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
