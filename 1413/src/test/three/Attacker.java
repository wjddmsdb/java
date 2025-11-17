package test.three;

public class Attacker extends AbstractMonster {

	public Attacker(String name, int hp, int defense) {
		super(name, hp, defense);
		name = "Attacker";
		hp = 30;
		attack = 20;
		defense = 10;
	}
	
	void attack() {
		System.out.println("Attacker - Very Strong Attack");
	}

}
