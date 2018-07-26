
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.User;
import dao.UserDAO;

public class UserManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public UserManager(){
	}

	//  追加する
	//  引数はUserオブジェクト
	public void registerUser(User user){

		//  UserDAOオブジェクト生成
		UserDAO userDAO = new UserDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = userDAO.createConnection();

		//  UserオブジェクトをDataBaseに登録する
		userDAO.registerUser(user, this.connection);

		//  DataBaseとの接続を切断する
		userDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}

	//  検索
		public User searchUser(User user){

			//  UserDAOオブジェクト生成
			UserDAO userDAO = new UserDAO();

			//  DataBaseへ接続し、コネクションオブジェクトを生成する
			this.connection = userDAO.createConnection();

			//  検索する
			user = userDAO.searchUser(user, this.connection);

			//  DataBaseとの接続を切断する
			userDAO.closeConnection(this.connection);

			//  コネクションオブジェクトを破棄する
			this.connection = null;

			return user;
		}





}
