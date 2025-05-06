package ch07.sec09;

public class AnimalExample {
	public static void printAnimalInfo(Animal animal) {
		animal.sound();
		
		if(animal instanceof Dog dog) {
			dog.fetchBall();
		} else if (animal instanceof Cat cat) {
			cat.scratch();
		}
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();
		
		printAnimalInfo(a1);
		System.out.println();
		
		printAnimalInfo(a2);
		System.out.println();
		
		printAnimalInfo(a3);
	}


}
