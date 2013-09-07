package de.dschm12s.main;

import java.util.ArrayList;

import de.dschm12s.data.JDBCDataStrategy;
import de.dschm12s.model.Character;
import de.dschm12s.model.CharacterList;
import de.dschm12s.view.CharactersListView;

public class CharacterDemo {
public static void main(String[] args) {
	new CharactersListView();
	CharacterList chars = CharacterList.getInstance();
for(int i = 0; i<chars.getCharacterList().size();i++){
	chars.getCharacterList().get(i).toString();
}
}
}
