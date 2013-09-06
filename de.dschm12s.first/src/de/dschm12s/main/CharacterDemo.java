package de.dschm12s.main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.dschm12s.data.JDBCDataStrategy;
import de.dschm12s.model.CharFactory;
import de.dschm12s.model.Character;
import de.dschm12s.model.CharacterTypes;

public class CharacterDemo {
public static void main(String[] args) {
	
	JDBCDataStrategy conn = new JDBCDataStrategy();
	conn.getCharactersList();
}
}
