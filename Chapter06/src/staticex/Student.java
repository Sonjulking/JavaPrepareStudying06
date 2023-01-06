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
		int i = 10; //지역변수는 사용가능, 스택메모리에 쌓였다가 없어짐.
		
		i++;
		System.out.println(i);
		//studentName = '홍길동'; // 인스턴스변수(멤버변수)는 사용불가!
		//스태틱 변수는 new를 사용
		//안해도 사용가능해서 
		//생성되지도 않는 인스턴스 변수에 값을 넣을 위험이 있음.
		return serialNum;//스태틱 변수, 클래스 변수
	}
}
