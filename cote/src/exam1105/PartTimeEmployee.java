package exam1105;

public class PartTimeEmployee extends Employee {

	private int hourlyRate;
	private int workHours;
	
	protected PartTimeEmployee(String name, String employeeId) {
		super(name, employeeId);
		this.name = name;
		this.employeeId = employeeId;
	}
	
	@Override
    public int calculatePay() {
        return hourlyRate * workHours;
    }
	
	

}
