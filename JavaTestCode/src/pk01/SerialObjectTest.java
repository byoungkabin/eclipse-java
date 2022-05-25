package pk01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerialObjectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("serialObj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//직렬화가 가능한 SerialObject 객체 생성
		SerialObject so1 = new SerialObject("박찬호", "LA","투수");
		SerialObject so2 = new SerialObject("이승엽", "요미우리","4번타자");
		SerialObject so3 = new SerialObject("이병규", "주니치","3번타자");
		
		//ObjectOutputStream의 writeObject을 통해 총 3개의 객체를 파일(serialObj.txt)로 출력시킨다.
		oos.writeObject(so1);
		oos.writeObject(so2);
		oos.writeObject(so3);
		
		oos.close();
		
		// 역직렬화를 통해 객체를 파일로 부터 불러들여와서 객체를 복원
		FileInputStream fis = new FileInputStream("serialObj.txt");
		//파일로 출력되어 있는 겍체를 입력 받기 위한 파일 스트림 생성
		
		//겍체를 입력받기 위한 객체 임력 스트림 생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//객체를 생성하여 ObjectInputStream의 readObject()를 통해 역직렬화 해준다.
		SerialObject rso1 = (SerialObject) ois.readObject();
		SerialObject rso2 = (SerialObject) ois.readObject();
		SerialObject rso3 = (SerialObject) ois.readObject();
		
		System.out.println(rso1);
		System.out.println(rso2);
		System.out.println(rso3);
	}

}
