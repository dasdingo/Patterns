package de.dschm12s.se1Patterns;

public abstract class Character {
//Properties
	
	String name;
	SprechVerhalten sprechVerhalten;
//Methods
	
	
	public void sprechen(){
		this.sprechVerhalten.tuSprechen();
	}
	public void setSprechVerhalten(SprechVerhalten sprechVerhalten){
		this.sprechVerhalten = sprechVerhalten;
	}
}
