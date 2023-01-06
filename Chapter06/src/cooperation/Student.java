package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeSubway(Subway subway) { // 객체의 협업, 제일 핵심!
		subway.take(1500);
		money -= 1500;
	}

	public void takeBus(Bus bus) { // 객체의 협업, 제일 핵심!
		bus.take(1000);
		money -= 1000;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
	}

//	public void takeTrans(Trans trans) {
//	} //상속을 사용하여 만들때 사용!

}
