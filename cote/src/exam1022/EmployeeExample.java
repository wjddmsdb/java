package exam1022;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("김자바","1111",360000);
		emps[1] = new PartTimeEmployee("이자바","1122",20000,100);
		
		for(int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].getName() + "-"+emps[i].calculatePay());
		}
		
	}

}
