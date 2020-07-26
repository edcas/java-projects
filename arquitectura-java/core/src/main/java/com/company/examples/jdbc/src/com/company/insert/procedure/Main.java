package com.company.insert.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private static final String USERNAME = "root";

	private static final String PASSWORD = "sasa";

	public static void main(String[] args) {

		String database = "jdbc:mysql://localhost:3306/course";

		try (Connection connection = DriverManager.getConnection(database, USERNAME, PASSWORD);
				CallableStatement statement = connection.prepareCall("{ CALL allPeople() }");
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

}
