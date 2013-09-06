package de.dschm12s.view;

import javax.swing.JButton;
import javax.swing.JFrame;

import de.dschm12s.controller.CharactersListController;
import de.dschm12s.model.CharacterList;

public class CharactersListView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6745778411465150512L;

	// Controller and Model
	CharactersListController controller;
	CharacterList characterList;
	
	// GUI Elements
	JButton okButton;
	
	
	public CharactersListView(){
		
	}
	
}
