package info.sjd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import info.sjd.entity.User;

public class UserDAO {

	public static User create(User user) {

		String sql = "INSERT INTO users (login, user_pass) VALUES (?,?)";
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, user.getLogin());
			statement.setString(2, user.getPassword());
			
			statement.executeUpdate();

			return findOne(user.getLogin());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}

		return null;
	}

	public static User findOne(String login) {

		String sql = "SELECT * FROM users WHERE login=?";
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement statement = null;
		ResultSet rSet = null;

		try {

			statement = connection.prepareStatement(sql);
			
			statement.setString(1, login);

			rSet = statement.executeQuery();

			while (rSet.next()) {
				User user = new User();

				user.setUserId(rSet.getInt("user_id"));
				user.setLogin(rSet.getString("login"));
				user.setPassword(rSet.getString("user_pass"));

				return user;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(connection, statement, rSet);
		}

		return null;
	}

	public static List<User> findAll() {

		List<User> users = new ArrayList<>();
		
 		String sql = "SELECT * FROM users";
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement statement = null;
		ResultSet rSet = null;

		try {

			statement = connection.prepareStatement(sql);
			
			rSet = statement.executeQuery();

			while (rSet.next()) {
				User user = new User();

				user.setUserId(rSet.getInt("user_id"));
				user.setLogin(rSet.getString("login"));
				user.setPassword(rSet.getString("user_pass"));

				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(connection, statement, rSet);
		}

		return users;
	}

	
	
	public static User update(User user) {

		String sql = "UPDATE users SET login=?, user_pass=? WHERE user_id=?";
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, user.getLogin());
			statement.setString(2, user.getPassword());
			statement.setInt(3, user.getUserId());

			statement.executeUpdate();

			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}

		return null;
	}

	public static void delete(String login) {
		String sql = "DELETE FROM users WHERE login=?";
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, login);

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}

	}
}
