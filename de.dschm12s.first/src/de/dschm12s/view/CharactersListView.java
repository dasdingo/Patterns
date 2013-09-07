package de.dschm12s.view;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
	//Properties
	
	
	public CharactersListView(){
		CharacterList chars = CharacterList.getInstance();
		
		
		JFrame f = new JFrame();
		  f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  DefaultTableModel tableModel = new DefaultTableModel();
		  tableModel.addColumn("Name");
		  tableModel.addColumn("Typ");
		  tableModel.addColumn("Level");
		  tableModel.addColumn("Alter");
		 
		  for(int i = 0; i<chars.getCharacterList().size();i++){
		  	Vector vector = new Vector();
		  	vector.add(chars.getCharacterList().get(i).getName());
		  	vector.add(chars.getCharacterList().get(i).getType());
		  	vector.add(chars.getCharacterList().get(i).getLevel());
		  	vector.add(chars.getCharacterList().get(i).getAge());
		  	tableModel.addRow(vector);
		  }
		  JTable table = new JTable(tableModel);
		  
		  f.add( new JScrollPane(table) );
		  f.pack();
		  f.setVisible( true );
	}
	
}
