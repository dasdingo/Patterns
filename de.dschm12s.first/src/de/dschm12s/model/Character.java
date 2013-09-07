package de.dschm12s.model;

public abstract class Character {
//Properties
	
	String name;
	public String getName() {
		return name;
	}


	public String getType() {
		return type;
	}


	public int getLevel() {
		return level;
	}


	public int getAge() {
		return age;
	}


	public SprechVerhalten getSprechVerhalten() {
		return sprechVerhalten;
	}
	String type;
	int level;
	int age;
	SprechVerhalten sprechVerhalten;
//Konst
	
	public Character(String name, String type, int level, int age){
		this.name = name;
		this.type = type;
		this.level = level;
		this.age = age;
	}
	
	
	//Methods
	
	
	public void sprechen(){
		this.sprechVerhalten.tuSprechen();
	}
	public void setSprechVerhalten(SprechVerhalten sprechVerhalten){
		this.sprechVerhalten = sprechVerhalten;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		String string = "Name: " +name + " Typ: " + type + " Level: " + level + " Alter: " + age;	
		return string;
		}

}
