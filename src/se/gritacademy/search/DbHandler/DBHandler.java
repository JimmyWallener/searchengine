package se.gritacademy.search.DbHandler;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import se.gritacademy.search.model.DBConnection;

import se.gritacademy.search.model.Model;
import se.gritacademy.search.utils.DestructString;




public class DBHandler {
	
	String[] strings = null;
	StringBuilder values = new StringBuilder();
	List<String> output = new ArrayList<String>();
	DBConnection connect = new DBConnection();
	DestructString ds = new DestructString();
	String union = Model.getUnion();
	String bears = Model.getBearbase();
	String ikea = Model.getIkeanames();
	String masters = Model.getMasters();
	
	
	public void queryDB(String[] list){
		
		strings = list;
		
		try {
				Connection con = connect.initDatabase();
				
				values.append(" (");
				for (int i = 1; i <= strings.length;i++) {
					values.append("?");
					
					if (strings.length > i) {
						values.append(",");
						}
				}
				values.append(" )");

				
				if (con != null) {
					System.out.println("Connected to the database!");
				} else {
					System.out.println("Failed to make connection!");
				}
				
				
				PreparedStatement search = con.prepareStatement(bears.concat(values.toString()) + " " + union + " " +
																ikea.concat(values.toString()) + " " + union + " " +
															masters.concat(values.toString()));
					
				int test = strings.length;
				
				for (int i = 1; i < (test * 3) + 1; i++) {
					for (int j = 0; j < test;j++) {
					search.setString(i, "^" + strings[j]);
					}
				}
				
				ResultSet rs = search.executeQuery();
				
				ResultSetMetaData meta = rs.getMetaData();
				int columns = meta.getColumnCount();
				
				if(!rs.next()) {
					System.out.println("No Data");
				} else {
					do {
						for (int i = 1; i <= columns;i++) {
							output.add(rs.getString(i));
							}
					}while (rs.next());
				}
				
				rs.close();
				con.close();
				output.removeIf(Objects::isNull);
				System.out.println(output.toString());
				
				for (String e : output) {
					System.out.println(e);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		
			
	}
}
	
	
	


