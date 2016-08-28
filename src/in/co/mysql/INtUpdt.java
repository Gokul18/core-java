package in.co.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class INtUpdt {
	public static void main(String[] args) throws Exception {
		//testAdd();
		testUpdate();
	}

	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sqltest","root","root");
		Statement stmt=conn.createStatement();
		int i=stmt.executeUpdate("UPDATE part SET color='yellow' WHERE id=8");
		System.out.println(i+"Record Updated");
		stmt.close();
		conn.close();
	}

	public static void testAdd() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/sqltest", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("INSERT into part value(8,'plat','green')");
		System.out.println(i + "Record(s)Updat");
		stmt.close();
		conn.close();
	}

}