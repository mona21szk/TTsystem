
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.PlayedTournament;
import dao.PlayedTournamentDAO;

public class PlayedTournamentManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public PlayedTournamentManager(){
	}

	//  追加する
	//  引数はPlayedTournamentオブジェクト
	public void registerPlayedTournament(PlayedTournament played_tournament){

		//  PlayedTournamentDAOオブジェクト生成
		PlayedTournamentDAO played_tournamentDAO = new PlayedTournamentDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = played_tournamentDAO.createConnection();

		//  PlayedTournamentオブジェクトをDataBaseに登録する
		played_tournamentDAO.registerPlayedTournament(played_tournament, this.connection);

		//  DataBaseとの接続を切断する
		played_tournamentDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}

	//  選手名での検索
		public PlayedTournament searchPlayedTournament(PlayedTournament played_tournament){

			//  PlayedTournamentDAOオブジェクト生成
			PlayedTournamentDAO played_tournamentDAO = new PlayedTournamentDAO();

			//  DataBaseへ接続し、コネクションオブジェクトを生成する
			this.connection = played_tournamentDAO.createConnection();

			//  検索する

			played_tournament = played_tournamentDAO.searchPlayedTournament(played_tournament, this.connection);

			//  DataBaseとの接続を切断する
			played_tournamentDAO.closeConnection(this.connection);

			//  コネクションオブジェクトを破棄する
			this.connection = null;

			return played_tournament;
		}






}
