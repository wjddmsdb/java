package exam1117;

public class test {
	private int value;
	
	public void setValue(int value) { this.value = value; }
	public int getValue() { return value; }
	
	public void merge(test other) {
		this.value = this.value + other.getValue(); //other.getValue();
	}
}
