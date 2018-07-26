
//　自分が格納されているフォルダ名
package dao;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beans.PlayedTournament;

public class PlayedTournament2DAO{

	//  属性

	//  データベースの接続先アドレスを静的変数として記述
	private final static String DRIVER_URL =
		"jdbc:mysql://localhost:3306/tabletennis?useUnicode=true&characterEncoding=Windows-31J";

	//  データベース接続ドライバの名前を静的変数として記述
	private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";

	//  データベースのユーザー名　（デフォルトではroot）
	private final static String USER_NAME = "root";

	//  データベースのユーザーのパスワード　(デフォルトでは設定なし)
	private final static String PASSWORD = "mallow";

	//  データベースとの接続を行う
	//  データベースの接続情報を持ったConnectionオブジェクトを返す
	public Connection createConnection(){
		try{
			Class.forName(DRIVER_NAME);
			Connection con = DriverManager.getConnection(DRIVER_URL, USER_NAME, PASSWORD);
			return con;
		} catch(ClassNotFoundException e){
			System.out.println("Can't Find JDBC Driver.\n");

		} catch(SQLException e){
			System.out.println("Connect Error.\n");
		}
		return null;
	}

	//  Connectionオブジェクトを使って、データベースとの接続を切断する
	//  引数Connectionオブジェクト
	public void closeConnection(Connection con){

		try{
			con.close();
		}catch(Exception ex){}
	}

public PlayedTournament searchPlayedTournament2(PlayedTournament played_tournament, Connection connection){

			try{

				//  SQLコマンド
				String sql = "select * from played_tournament where tournament_name = '" + played_tournament.getTournamentName() + "'";

				//  SQLのコマンドを実行する
				//  実行結果はrsに格納される
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				rs.first();

				//  rsからそれぞれの情報を取り出し、PlayedTournamentオブジェクトに設定する
				played_tournament.setPlayerName(rs.getString("player_name"));
				played_tournament.setTournamentName(rs.getString("tournament_name"));


				//  終了処理
				stmt.close();
				rs.close();

				//  PlayedTournamentオブジェクトを返す
				return played_tournament;

				}catch(SQLException e){

					//	エラーが発生した場合、エラーの原因を出力し、nullオブジェクトを返す
					e.printStackTrace();
					return null;

				}finally{
				}
}
}