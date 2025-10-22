package exam1022;

public class Tire {
	private String model;
	private int max;
	private int current= 0;
	
	public Tire(String model, int max) {
		this.model = model;
		this.max = max;
	}
	
	public boolean roll() {
		current++;
		if (current > max) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
