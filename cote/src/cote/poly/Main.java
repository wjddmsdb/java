package cote.poly;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] myAnimals = new Animal[5];
		myAnimals[0] = new Cow();
		myAnimals[1] = new Dog();
		myAnimals[2] = new Mouse();
		myAnimals[3] = new Dog();
		myAnimals[4] = new Cat();
		
		for(Animal a:myAnimals) {
			System.out.println(a.hello());
		}
	}

}
