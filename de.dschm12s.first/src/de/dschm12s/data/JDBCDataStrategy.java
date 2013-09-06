package de.dschm12s.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import de.dschm12s.model.CharacterList;





public class JDBCDataStrategy implements DataPersistenceStrategy{
	public Connection conn;
	public JDBCDataStrategy(){
		try {
			 conn = DriverManager.getConnection("jdbc:mysql://localhost/spieldaten?user=admin&password=200163");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public CharacterList[] getCharactersList() {
		ResultSet rs;
		Character character;
		try {
			Statement state = this.conn.createStatement();
			//TODO:SQL Abfrage ObjektMapping
			String sql = "SELECT * FROM CharacterList"; 
			rs = state.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int spalten = rsmd.getColumnCount();
				
			while (rs.next()){
				int i = 1;
				while(i<spalten+1){
				            System.out.println(rsmd.getColumnLabel(i)+": " + rs.getString(i)+" ");
				            i++;
				}
				System.out.println("\n");
			}
		rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CharacterList[4];
	}
}
