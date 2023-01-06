package singleton;

public class Company {
	private static Company instance = new Company(); // 전체에서 유일하게 쓰는 인스턴스

	private Company() { // 생성자에 아무나 접근하지 못함.
	}

	public static Company getInstance() { // 스태틱을 사용하면 객체를 생성하지 않고 메서드를 부를 수 있음.
		if(instance == null) { //인스턴스가 널인경우가 거의없겠지만... 혹시 널이면..!
			instance = new Company();
		}
		return instance; // 생성된 인스턴스 객체를 외부에서 가져다가 쓸 수 있음.
	}
}
