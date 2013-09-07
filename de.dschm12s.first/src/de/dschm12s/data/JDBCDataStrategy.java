package de.dschm12s.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import de.dschm12s.model.CharFactory;
import de.dschm12s.model.CharacterList;
import de.dschm12s.model.CharacterTypes;
import de.dschm12s.model.Elf;
import de.dschm12s.model.Orc;
import de.dschm12s.model.Character;

public class JDBCDataStrategy implements DataPersistenceStrategy {
	public Connection conn;

	public JDBCDataStrategy() {
		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/spieldaten?user=admin&password=200163");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Character> getCharactersList() {
		ResultSet rs;
		ArrayList<Character> characterList = new ArrayList<Character>();
		try {
			Statement state = this.conn.createStatement();
			// TODO:SQL Abfrage ObjektMapping
			String sql = "SELECT * FROM CharacterList";
			rs = state.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();

			int spalten = rsmd.getColumnCount();
			String name = "";
			String type = "";
			int level = 0;
			int age = 0;
			while (rs.next()) {
				int i = 1;
				while (i < spalten + 1) {

					switch (i) {

					case 1:
						System.out.println(rsmd.getColumnLabel(i) + ": "
								+ rs.getString(i) + " ");
						break;
					case 2:
						name = rs.getString(i);
						break;
					case 3:
						type = rs.getString(i);
						break;
					case 4:
						age = rs.getInt(i);
						break;
					case 5:
						level = rs.getInt(i);
						break;
					default:
						System.out.println("SQL Fehler");
					}
					i++;
				}
				switch (type) {
				case "Elf":
					characterList.add(new Elf(name, type, level, age));
					break;
				case "Orc":
					characterList.add(new Orc(name, type, level, age));
					break;
				default:
					System.out.println("CharType Fehler");
				}
				System.out.println("\n");
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return characterList;
	}
}
