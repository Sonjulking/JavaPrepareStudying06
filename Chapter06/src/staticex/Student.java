package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; //���������� ��밡��, ���ø޸𸮿� �׿��ٰ� ������.
		
		i++;
		System.out.println(i);
		//studentName = 'ȫ�浿'; // �ν��Ͻ�����(�������)�� ���Ұ�!
		//����ƽ ������ new�� ���
		//���ص� ��밡���ؼ� 
		//���������� �ʴ� �ν��Ͻ� ������ ���� ���� ������ ����.
		return serialNum;//����ƽ ����, Ŭ���� ����
	}
}
