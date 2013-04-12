package behavioralPatterns;

public abstract class Tier {

	int anzahlBeine;
	String fell;
	String name;
	public LautVerhalten lautVerhalten;
	
	public LautVerhalten getLautVerhalten() {
		return lautVerhalten;
	}

	public void setLautVerhalten(LautVerhalten lautVerhalten) {
		this.lautVerhalten = lautVerhalten;
	}

	public void gibLaut(){
	lautVerhalten.gibLaut();	
		
	}
	}
		
		
	
	

