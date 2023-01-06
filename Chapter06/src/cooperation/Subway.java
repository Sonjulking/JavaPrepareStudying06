package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	/*
	 * public Subway(int lineNum) { lineNumber = linNum; } //이렇게 해주면 
	 */ //this를 안써줘도 되지만 가독성이 떨어짐. 그래서 this를 써주고 이름을 동일하게 맞춰줌
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은" 
	+ passengerCount +"명이고, 수입은" + money + "입니다.");
	}

}
