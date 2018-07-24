
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.Tournament;
import dao.TournamentDAO;

public class TournamentManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public TournamentManager(){
	}

	//  追加する
	//  引数はTournamentオブジェクト
	public void registerTournament(Tournament tournament){

		//  TournamentDAOオブジェクト生成
		TournamentDAO tournamentDAO = new TournamentDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = tournamentDAO.createConnection();

		//  TournamentオブジェクトをDataBaseに登録する
		tournamentDAO.registerTournament(tournament, this.connection);

		//  DataBaseとの接続を切断する
		tournamentDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}

	//  検索
		public Tournament searchTournament(Tournament tournament){

			//  TournamentDAOオブジェクト生成
			TournamentDAO tournamentDAO = new TournamentDAO();

			//  DataBaseへ接続し、コネクションオブジェクトを生成する
			this.connection = tournamentDAO.createConnection();

			//  検索する
			tournament = tournamentDAO.searchTournament(tournament, this.connection);

			//  DataBaseとの接続を切断する
			tournamentDAO.closeConnection(this.connection);

			//  コネクションオブジェクトを破棄する
			this.connection = null;

			return tournament;
		}





}
