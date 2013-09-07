package de.dschm12s.model;

public class Elf extends Character{

	
	
	public Elf(String name, String type, int level, int age){
		super(name, type, level, age);
		setSprechVerhalten(new ElfSprechVerhalten());
	}
	//Methods
	
}
