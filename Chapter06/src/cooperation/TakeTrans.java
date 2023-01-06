package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james = new Student("James", 5000);
		Student tomas = new Student("Tames", 10000);

		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();

		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		//총인스턴스 4개를 만듬 토마스, 제임스, 지하철, 버스 
	}
}
