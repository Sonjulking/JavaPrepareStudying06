package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

//		Company company = new Company();
		
//		Company company2 = new Company();
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		// 동일한 주소값이 나옴.
		
		//Calendar cal = Calendar.getInstance(); //시간 이런거도 여러개가 있으면 안되니까 싱글톤으로만들어짐
		
	}

}
