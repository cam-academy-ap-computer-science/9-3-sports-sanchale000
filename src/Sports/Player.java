package Sports;

public class Player {
	private String name;
	private int age;
	private int heightInches;

	public Player(String name, int age, int heightInches) {
		this.name = name;
		this.age = age;
		this.heightInches = heightInches;

	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeightInches() {
		return heightInches;
	}

	public String toString() {
		return "Name: " + name + " Age: " + age + " Height: " + heightInches;
	}

}
