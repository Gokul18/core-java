package in.co.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Getdata {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/sqltest", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select id,name,color FROM part");
		System.out.println("ID\tName\tColor");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString("color"));
		}
		System.out.println("Prog. wok or successfull");
		stmt.close();
		conn.close();
	}

}
