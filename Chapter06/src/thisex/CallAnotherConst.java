package thisex;

class Person {
	String name;
	int age;

	public Person() {  //디폴트 생성자
		//this 사용시 어떠한 스테이트먼트도 오면 안된다. 
		//디폴트 생성자에서 디스를 사용한다는 것은 
		//인스턴스가 안만들어져서 사용한다고 생각하기 때문에
		//스테이트먼트가 나오면 안된다.
		this("이름없음",1); //디폴트 생성자에서  다른 생성자 호출
	}
	
	public Person(String name, int age) { //생성자
 		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.returnSelf());
		
		
	}

}
