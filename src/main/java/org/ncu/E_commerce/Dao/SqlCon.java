package org.ncu.E_commerce.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlCon {

	public Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String URL = "jdbc:mysql://localhost/mvc";
			String user = "enter_your_dbUser";
			String pass = "enter_your_password";
			Connection con = DriverManager.getConnection(URL, user, pass);
			return con;
		} catch (Exception e) {
			System.out.println(e);

		}
		return null;

	}

}
