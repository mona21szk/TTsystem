package service;

import java.sql.Connection;

import beans.User;
import dao.UserDAO;

public class LoginService {

	private Connection connection = null;
	public LoginService() {
	}

	public User authenticate(String userId,String password) {
		UserDAO dao = new UserDAO();

		this.connection = dao.createConnection();
		User user = dao.findOne(userId, connection);
		dao.closeConnection(this.connection);

		this.connection = null;

		if(user == null) {
			return null;
		} else if(password.equals(user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}
}
