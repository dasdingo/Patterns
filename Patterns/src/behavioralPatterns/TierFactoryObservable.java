package behavioralPatterns;

public class TierFactoryObservable {

	public Hund makeHund(){
		return new Hund();
	}
	public Hund makeHund(String name){
		return new Hund(name);
	}
	public Kristian makeKristian(){
	return new Kristian();	
	}
	
}
