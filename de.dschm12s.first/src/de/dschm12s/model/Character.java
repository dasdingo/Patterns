package de.dschm12s.model;

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
