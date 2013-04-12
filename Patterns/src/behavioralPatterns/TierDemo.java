package behavioralPatterns;

public class TierDemo {

	/**
	 * StrategyPattern 
	 */
	public static void main(String[] args) {
		Tier hund = new Hund("bestDog");
Tier kris = new Kristian();
hund.gibLaut();
kris.gibLaut();
kris.setLautVerhalten(new Bellen());
kris.gibLaut();
	}

}
