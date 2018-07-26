
//　自分が格納されているフォルダ名
package dao;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beans.Record;

public class RecordDAO{

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

	//  情報をデータベースに登録する
	//  引数はRecordオブジェクトと、Connectionオブジェクト
	public void registerRecord(Record record, Connection connection){

		try{

			//  SQLコマンド
			String sql = "insert into record(player_name,tournament_name,day,count,stage,user_name) values(?, ?, ?,?,?,?)";

			//  SQLコマンドの実行
			PreparedStatement stmt = connection.prepareStatement(sql);

			//  SQLコマンドのクエッションマークに値を、1番目から代入する
			stmt.setString(1, record.getPlayerName());
			stmt.setString(2, record.getTournamentName());
			stmt.setString(3, record.getBattleDay());
			stmt.setString(4, record.getBattleCount());
			stmt.setString(5, record.getBattleStage());
			stmt.setString(6, record.getUserName());


			stmt.executeUpdate();

		}catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}
	}

	//  検索する
		//  引数はRecordオブジェクトと、Connectionオブジェクト
		public Record searchRecord(Record record, Connection connection){

			try{

				//  SQLコマンド
				String sql = "select * from record where player_name = '" + record.getPlayerName() + "' and tournament_name='"+record.getTournamentName()+"'and user_name='"+record.getUserName()+"'";

				//  SQLのコマンドを実行する
				//  実行結果はrsに格納される
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				rs.first();

				//  rsからそれぞれの情報を取り出し、Recordオブジェクトに設定する
				record.setPlayerName(rs.getString("player_name"));
				record.setTournamentName(rs.getString("tournament_name"));
				record.setBattleDay(rs.getString("day"));
				record.setBattleCount(rs.getString("count"));
				record.setBattleStage(rs.getString("stage"));
				record.setUserName(rs.getString("user_name"));


				//  終了処理
				stmt.close();
				rs.close();

				//  Recordオブジェクトを返す
				return record;

				}catch(SQLException e){

					//	エラーが発生した場合、エラーの原因を出力し、nullオブジェクトを返す
					e.printStackTrace();
					return null;

				}finally{
				}
		}

	}




