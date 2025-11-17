package test.three;

public class Defender extends AbstractMonster {

	public Defender(String name, int hp, int defense) {
		super(name, hp, defense);
		name = "Defender";
		hp = 20;
		attack = 13;
		defense =25;
	}
	
	void attack() {
		System.out.println("Defender - Attack");
	}

}
