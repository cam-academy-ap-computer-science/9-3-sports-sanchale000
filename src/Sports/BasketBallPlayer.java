package Sports;

public class BasketBallPlayer extends Player {
	private String team;
	private double avgPts;
	
	public BasketBallPlayer(String name, int age, int heightInches, String team, double avgPts) {
		super(name, age, heightInches);
		this.team = team;
		this.avgPts = avgPts;
	}
	
	public String toString() {
		return "Name: " + super.getName() + " Age: " + super.getAge() + " Height: " + super.getHeightInches() + " Team: " + team + " Average Points: " + avgPts;
	}
	
}
