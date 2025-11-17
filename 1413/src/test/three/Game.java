package test.three;


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMonster m1 = new AbstractMonster();
		AbstractMonster m2 = new AbstractMonster();
		
		m1.defnse(m2.attack());
		m2.defense(m1.attack());
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(hp);
		
	}

}
