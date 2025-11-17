package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}

	public AbstractMonster(String name, int hp, int defense) {
		this.name = name;
		this.hp = hp;
		this.defense = defense;
	}
	
	void defense(int attack) {
		 
	}
	void attack()
	{
		
	}
	

}
