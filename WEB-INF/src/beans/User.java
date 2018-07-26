
//  自分が格納されているフォルダ名
package beans;

public class User {

	//  属性
	private String userID = null;			//　ユーザーID
	private String userPassword = null;			//　パスワード




	//　初期値を引数に持ったコンストラクタ
	public User(String userID, String userPassword){

		this.userID = userID;
		this.userPassword = userPassword;


	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public User(){}

	//  setメソッド
	//  Java beansのsetメソッドはsetの後ろに続く文字列が必ず大文字であること
	public void setUserID(String userID){ this.userID = userID; }
	public void setUserPassword(String userPassword){ this.userPassword = userPassword; }

	//  getメソッド
	//  Java beansのgetメソッドはgetの後ろに続く文字列が必ず大文字であること
	public String getUserID(){ return this.userID; }
	public String getUserPassword(){ return this.userPassword; }


}
