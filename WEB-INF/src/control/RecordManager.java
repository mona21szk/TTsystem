
//　自分が格納されているフォルダ名
package control;

//  自分が格納されているフォルダの外にある必要なクラス
import java.sql.Connection;

import beans.Record;
import dao.RecordDAO;

public class RecordManager {

	//  属性
	private Connection connection = null;

	//  引数を持たないコンストラクタ
	public RecordManager(){
	}

	//  追加する
	//  引数はRecordオブジェクト
	public void registerRecord(Record record){

		//  RecordDAOオブジェクト生成
		RecordDAO recordDAO = new RecordDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = recordDAO.createConnection();

		//  RecordオブジェクトをDataBaseに登録する
		recordDAO.registerRecord(record, this.connection);

		//  DataBaseとの接続を切断する
		recordDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}

	//  検索
		public Record searchRecord(Record record){

			//  RecordDAOオブジェクト生成
			RecordDAO recordDAO = new RecordDAO();

			//  DataBaseへ接続し、コネクションオブジェクトを生成する
			this.connection = recordDAO.createConnection();

			//  検索する
			record = recordDAO.searchRecord(record, this.connection);

			//  DataBaseとの接続を切断する
			recordDAO.closeConnection(this.connection);

			//  コネクションオブジェクトを破棄する
			this.connection = null;

			return record;
		}





}
