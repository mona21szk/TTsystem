
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.Player;
import dao.PlayerDAO;

public class PlayerManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public PlayerManager(){
	}

	//  追加する
	//  引数はPlayerオブジェクト
	public void registerPlayer(Player player){

		//  PlayerDAOオブジェクト生成
		PlayerDAO playerDAO = new PlayerDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = playerDAO.createConnection();

		//  PlayerオブジェクトをDataBaseに登録する
		playerDAO.registerPlayer(player, this.connection);

		//  DataBaseとの接続を切断する
		playerDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}

	//  検索
		public Player searchPlayer(Player player){

			//  PlayerDAOオブジェクト生成
			PlayerDAO playerDAO = new PlayerDAO();

			//  DataBaseへ接続し、コネクションオブジェクトを生成する
			this.connection = playerDAO.createConnection();

			//  検索する
			player = playerDAO.searchPlayer(player, this.connection);

			//  DataBaseとの接続を切断する
			playerDAO.closeConnection(this.connection);

			//  コネクションオブジェクトを破棄する
			this.connection = null;

			return player;
		}





}
