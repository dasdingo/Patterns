package de.dschm12s.model;

public class Orc extends Character{

	public Orc(String name, String type, int level, int age){
		super(name, type, level, age);
		setSprechVerhalten(new OrcSprechVerhalten());
	}
	
	//Methods
		
}
