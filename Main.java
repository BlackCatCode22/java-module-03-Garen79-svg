package myanimals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cat
		
		System.out.println(Cat.getCatCount());
		
		Cat myCat = new Cat();
		myCat.meow();
		myCat.name = "Stella";
		myCat.age = 8;
		myCat.numOfAnimals = 13;
		
		System.out.println(Cat.getCatCount());
		
		//number of animals: cat
		
		System.out.println(myCat.numOfAnimals);
	
		
		
		//dog
		
		System.out.println(Dog.getdogCount());
		
		Dog myDog = new Dog();
		myDog.woof();
		myDog.name = "Ben";
		myDog.age = 4;
		myDog.numOfAnimals = 7;
		
		System.out.println(Dog.getdogCount());
		
		//number of animals: dog
		
		System.out.println(myDog.numOfAnimals);
	}

}
