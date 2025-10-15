package exam1015;

public class SweetPotatoPizza extends Pizza {
	public SweetPotatoPizza() {
		size = "M";
	}
	public SweetPotatoPizza(String size) {
		this.size = size;
		this.name = "고구마피자";
		prices = new int[] { 23000, 27000, 31000 };
		this.toppings = "SweetPotato";
	}
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다.");
		super.cook();
	}

}
