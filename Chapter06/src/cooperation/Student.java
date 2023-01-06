package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeSubway(Subway subway) { // ��ü�� ����, ���� �ٽ�!
		subway.take(1500);
		money -= 1500;
	}

	public void takeBus(Bus bus) { // ��ü�� ����, ���� �ٽ�!
		bus.take(1000);
		money -= 1000;
	}

	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�� �Դϴ�.");
	}

//	public void takeTrans(Trans trans) {
//	} //����� ����Ͽ� ���鶧 ���!

}
