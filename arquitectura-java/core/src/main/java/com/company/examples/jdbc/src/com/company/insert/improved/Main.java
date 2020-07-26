package com.company.insert.improved;

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

			String query = "INSERT INTO person (first_name, last_name, age) values ('John', 'Doe', 30)";
			statement.executeUpdate(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
