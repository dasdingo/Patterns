package de.dschm12s.model;

import java.util.ArrayList;

public class CharacterList {

	// Properties
	ArrayList<Character> characterList;
	private CharacterList instance;
	
	// Singleton
	//TODO: DB Bindung initialisieren
	private CharacterList(){
		characterList = new ArrayList<Character>();
	}
	public CharacterList getInstance(){
		if(instance == null){
			return new CharacterList();
		}
	   return instance;
	}
	
	
	public ArrayList<Character> getCharacterList(){
		return this.characterList;
	}

	public void addCharacter(Character character){
		this.characterList.add(character);
	}
	
	public void removeCharacter(Character character){
		this.characterList.remove(character);
	}
}
