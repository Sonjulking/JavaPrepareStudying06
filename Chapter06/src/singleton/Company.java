package singleton;

public class Company {
	private static Company instance = new Company(); // ��ü���� �����ϰ� ���� �ν��Ͻ�

	private Company() { // �����ڿ� �ƹ��� �������� ����.
	}

	public static Company getInstance() { // ����ƽ�� ����ϸ� ��ü�� �������� �ʰ� �޼��带 �θ� �� ����.
		if(instance == null) { //�ν��Ͻ��� ���ΰ�찡 ���Ǿ�������... Ȥ�� ���̸�..!
			instance = new Company();
		}
		return instance; // ������ �ν��Ͻ� ��ü�� �ܺο��� �����ٰ� �� �� ����.
	}
}
