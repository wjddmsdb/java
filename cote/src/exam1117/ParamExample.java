package exam1117;

public class ParamExample {
	private int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		
		printInfo(array);
		ParamExample pe = new ParamExample();
		pe.a = 0;
		
	
		
		System.out.println("in main " + array[2]);
		
		
	}
	public static void printInfo(int[] values) {
		System.out.println(values[2]);
		values[2]+= 10;
		System.out.println(values[2]);
	}

}
