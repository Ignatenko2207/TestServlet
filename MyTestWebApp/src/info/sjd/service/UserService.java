package info.sjd.service;

import java.util.List;

import info.sjd.dao.UserDAO;
import info.sjd.entity.User;

public class UserService {

	public static User create(User user) {
		if (UserDAO.findOne(user.getLogin()) == null) {
			return UserDAO.create(user);
		}
		return null;
	}
	
	public static User update(User user) {
		if (UserDAO.findOne(user.getLogin()) != null) {
			return UserDAO.update(user);
		}
		return null;
	}
	
	public static void delete(String login) {
		UserDAO.delete(login);
	}
	
	public static User findOne(String login) {
		return UserDAO.findOne(login);
	}
	
	public static List<User> getAll(){
		return UserDAO.findAll();
	}
}
