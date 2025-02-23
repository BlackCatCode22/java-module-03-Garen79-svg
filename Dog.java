package myanimals;

public class Dog {
	
	public static final int MAX_LIVES = 1;
	
	private static int dogCount = 8;
	
	String name;
	int age;
	int livesRemaining;
	int numOfAnimals;
	
	public void woof() {
		System.out.println("Woof");
	}
	
	public Dog () {
		dogCount++;
		livesRemaining = MAX_LIVES;
	}
	
	public static int getdogCount() {
		return dogCount;
	}
	
	public static int numOfAnimals() {
		return dogCount;
		
	}
	
}
