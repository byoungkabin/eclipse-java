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
		
		//����ȭ�� ������ SerialObject ��ü ����
		SerialObject so1 = new SerialObject("����ȣ", "LA","����");
		SerialObject so2 = new SerialObject("�̽¿�", "��̿츮","4��Ÿ��");
		SerialObject so3 = new SerialObject("�̺���", "�ִ�ġ","3��Ÿ��");
		
		//ObjectOutputStream�� writeObject�� ���� �� 3���� ��ü�� ����(serialObj.txt)�� ��½�Ų��.
		oos.writeObject(so1);
		oos.writeObject(so2);
		oos.writeObject(so3);
		
		oos.close();
		
		// ������ȭ�� ���� ��ü�� ���Ϸ� ���� �ҷ��鿩�ͼ� ��ü�� ����
		FileInputStream fis = new FileInputStream("serialObj.txt");
		//���Ϸ� ��µǾ� �ִ� ��ü�� �Է� �ޱ� ���� ���� ��Ʈ�� ����
		
		//��ü�� �Է¹ޱ� ���� ��ü �ӷ� ��Ʈ�� ����
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//��ü�� �����Ͽ� ObjectInputStream�� readObject()�� ���� ������ȭ ���ش�.
		SerialObject rso1 = (SerialObject) ois.readObject();
		SerialObject rso2 = (SerialObject) ois.readObject();
		SerialObject rso3 = (SerialObject) ois.readObject();
		
		System.out.println(rso1);
		System.out.println(rso2);
		System.out.println(rso3);
	}

}
