
//　自分が格納されているフォルダ名
package dao;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beans.Player;

public class PlayerDAO{

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
	//  引数はPlayerオブジェクトと、Connectionオブジェクト
	public void registerPlayer(Player player, Connection connection){

		try{

			//  SQLコマンド
			String sql = "insert into player values(?, ?, ?,?)";

			//  SQLコマンドの実行
			PreparedStatement stmt = connection.prepareStatement(sql);

			//  SQLコマンドのクエッションマークに値を、1番目から代入する
			stmt.setString(1, player.getPlayerName());
			stmt.setString(2, player.getPlayerSex());
			stmt.setString(3, player.getPlayerType());
			stmt.setString(4, player.getPlayerRubber());


			stmt.executeUpdate();

		}catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}
	}

	//  検索する
		//  引数はPlayerオブジェクトと、Connectionオブジェクト
		public Player searchPlayer(Player player, Connection connection){

			try{

				//  SQLコマンド
				String sql = "select * from player where player_name = '" + player.getPlayerName() + "'";

				//  SQLのコマンドを実行する
				//  実行結果はrsに格納される
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				rs.first();

				//  rsからそれぞれの情報を取り出し、Playerオブジェクトに設定する
				player.setPlayerSex(rs.getString("sex"));
				player.setPlayerType(rs.getString("type"));
				player.setPlayerRubber(rs.getString("rubber"));


				//  終了処理
				stmt.close();
				rs.close();

				//  Playerオブジェクトを返す
				return player;

				}catch(SQLException e){

					//	エラーが発生した場合、エラーの原因を出力し、nullオブジェクトを返す
					e.printStackTrace();
					return null;

				}finally{
				}
		}

	}




