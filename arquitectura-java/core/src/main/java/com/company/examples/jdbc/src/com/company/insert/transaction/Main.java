package com.company.insert.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private static final String USERNAME = "root";

	private static final String PASSWORD = "sasa";

	public static void main(String[] args) {

		String database = "jdbc:mysql://localhost:3306/course";

		try (Connection connection = DriverManager.getConnection(database, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();) {

			// connection.setAutoCommit(false);

			statement.executeUpdate("INSERT INTO person (first_name, last_name, age) VALUES ('Maggie', 'Doe', 20)");
			statement.executeUpdate("INSERT INTO person (first_name, last_name, age) VALUES ('Christian', 'Doe', 30)");
			statement.executeUpdate("INSERT INTO person (first_name, last_name, age) VALUES ('Maggie', 'Doe', 30)");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
