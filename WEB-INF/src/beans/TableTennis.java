
//  自分が格納されているフォルダ名
package beans;

public class TableTennis {

	//  属性
	private String userID = null;			//　書籍名
	private String userPassword = null;			//　著者名
	private String userLoginID = null;		//	出版社名

	//　初期値を引数に持ったコンストラクタ
	public TableTennis(String userID, String userPassword, String userLoginID){

		this.userID = userID;
		this.userPassword = userPassword;
		this.userLoginID = userLoginID;

	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public TableTennis(){}

	//  setメソッド
	//  Java beansのsetメソッドはsetの後ろに続く文字列が必ず大文字であること
	public void setUserID(String userID){ this.userID = userID; }
	public void setUserPassword(String userPassword){ this.userPassword = userPassword; }
	public void setUserLoginID(String userLoginID){ this.userLoginID = userLoginID; }

	//  getメソッド
	//  Java beansのgetメソッドはgetの後ろに続く文字列が必ず大文字であること
	public String getUserID(){ return this.userID; }
	public String getUserPassword(){ return this.userPassword; }
	public String getUserLoginID(){ return this.userLoginID; }

}
