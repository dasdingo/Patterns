package de.dschm12s.model;

import java.util.ArrayList;

import de.dschm12s.data.DataManager;
import de.dschm12s.data.JDBCDataStrategy;

public class CharacterList {

	// Properties
	ArrayList<Character> characterList;
	private static CharacterList instance;
	DataManager dataManager;

	// Singleton
	// TODO: DB Bindung initialisieren
	private CharacterList() {
		dataManager = new DataManager(new JDBCDataStrategy());

		characterList = dataManager.getDataPersistenceStrategy()
				.getCharactersList();
	}

	public static CharacterList getInstance() {
		if (instance == null) {
			instance = new CharacterList();

		}
		return instance;
	}

	public ArrayList<Character> getCharacterList() {
		return this.characterList;
	}

	public void addCharacter(Character character) {
		this.characterList.add(character);
	}

	public void removeCharacter(Character character) {
		this.characterList.remove(character);
	}
}
