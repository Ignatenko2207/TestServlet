package info.sjd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
	
	static final String DBURL= "jdbc:postgresql://localhost:5432/test_web_db";
	static final String DBUser = "postgres";
	static final String DBUserPassword= "248842";
		
	static Connection getConnection(){
		
		
		Connection connection = null;
		try{
			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection(DBURL, DBUser, DBUserPassword);
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}
	
	static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void closeConnection(Connection connection, PreparedStatement statement) {
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void closeConnection(Connection connection, PreparedStatement statement, ResultSet rSet) {
		try {
			rSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}