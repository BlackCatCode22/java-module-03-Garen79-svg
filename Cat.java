package myanimals;

public class Cat {
	
	public static final int MAX_LIVES = 9;
	
	private static int catCount = 0;
	
	String name;
	int age;
	int livesRemaining;
	int numOfAnimals;
	
	public void meow() {
		System.out.println("Meow");
	}
	
	public Cat () {
		catCount++;
		livesRemaining = MAX_LIVES;
	}
	
	public static int getCatCount() {
		return catCount;
	}
	
	public static int numOfAnimals() {
		return catCount;
		
	}
}
