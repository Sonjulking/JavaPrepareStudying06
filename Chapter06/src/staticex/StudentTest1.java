package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		System.out.println(studentJ.getSerialNum());
		System.out.println(Student.getSerialNum());
		Student studentT = new Student();
		System.out.println(studentT.getSerialNum());
		System.out.println(Student.getSerialNum());
		/*
	    Student studentJ = new Student();
		System.out.println(studentJ.studentID);

		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		System.out.println(studentT.serialNum); // 스태틱 변수는 멤버변수가 아니라 클래스로 처리해야됨.
		//Student.serialNum으로
		System.out.println(studentJ.serialNum); // 값을 공유하는 걸 알 수 있음.
		*/
	}

}
