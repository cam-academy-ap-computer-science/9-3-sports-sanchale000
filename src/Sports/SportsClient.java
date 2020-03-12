package Sports;

public class SportsClient {
	
	public static void main(String[] args) {
		Player bob = new Player("bob", 80, 48);
		System.out.println(bob.toString());
		BasketBallPlayer barry = new BasketBallPlayer("Barry", 35, 80, "Morons", 100000.0);
		System.out.println(barry.toString());
		
	}

}
