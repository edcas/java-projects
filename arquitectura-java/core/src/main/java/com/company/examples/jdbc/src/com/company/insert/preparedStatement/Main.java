package com.company.insert.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	private static final String USERNAME = "root";

	private static final String PASSWORD = "sasa";

	public static void main(String[] args) {

		String database = "jdbc:mysql://localhost:3306/course";
		String query = "SELECT * FROM person WHERE first_name = ?";

		try (Connection connection = DriverManager.getConnection(database, USERNAME, PASSWORD);
				PreparedStatement statement = getPreparedQueryByFirstName(query, "John", connection);
				ResultSet resultSet = statement.executeQuery();) {
			
			while(resultSet.next()) {
				System.out.println("**********");
				System.out.println(resultSet.getString("first_name"));
				System.out.println(resultSet.getString("last_name"));
				System.out.println(resultSet.getString("age"));
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static PreparedStatement getPreparedQueryByFirstName(String query, String firstName, Connection connection) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, firstName);
		
		return preparedStatement;
	}

}
