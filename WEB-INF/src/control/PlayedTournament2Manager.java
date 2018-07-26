
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.PlayedTournament;
import dao.PlayedTournament2DAO;

public class PlayedTournament2Manager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public PlayedTournament2Manager(){
	}



	//  大会名での検索
		public PlayedTournament searchPlayedTournament2(PlayedTournament played_tournament){

			//  PlayedTournament2DAOオブジェクト生成
			PlayedTournament2DAO played_tournament2DAO = new PlayedTournament2DAO();

			//  DataBaseへ接続し、コネクションオブジェクトを生成する
			this.connection = played_tournament2DAO.createConnection();

			//  検索する
			played_tournament = played_tournament2DAO.searchPlayedTournament2(played_tournament, this.connection);

			//  DataBaseとの接続を切断する
			played_tournament2DAO.closeConnection(this.connection);

			//  コネクションオブジェクトを破棄する
			this.connection = null;

			return played_tournament;
		}






}
