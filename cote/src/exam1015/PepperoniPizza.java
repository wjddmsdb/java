package exam1015;

public class PepperoniPizza extends Pizza {
	//public String name = "PepperoniPizza";
	//public String size;
	//int[] prices = {20000,25000,32000};
	//public String toopings = "peppernoi";
	
	public PepperoniPizza() {
		size = "M";
	}
	public PepperoniPizza(String size) {
		this.size = size;
		this.name = "페퍼로니피";
		prices = new int[] { 20000, 25000, 32000 };
		this.toppings = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}
	
}
