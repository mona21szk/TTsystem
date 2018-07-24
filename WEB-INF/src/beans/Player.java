
//  自分が格納されているフォルダ名
package beans;

public class Player {

	//  属性
	private String playerName = null;			//　選手名
	private String playerSex = null;			//　性別
	private String playerType = null;		//	戦型
	private String playerRubber = null;		//	ラバー



	//　初期値を引数に持ったコンストラクタ
	public Player(String playerName, String playerSex, String playerType,String playerRubber){

		this.playerName = playerName;
		this.playerSex = playerSex;
		this.playerType = playerType;
		this.playerRubber = playerRubber;

	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public Player(){}

	//  setメソッド
	//  Java beansのsetメソッドはsetの後ろに続く文字列が必ず大文字であること
	public void setPlayerName(String playerName){ this.playerName = playerName; }
	public void setPlayerSex(String playerSex){ this.playerSex = playerSex; }
	public void setPlayerType(String playerType){ this.playerType = playerType; }
	public void setPlayerRubber(String playerRubber){ this.playerRubber = playerRubber; }

	//  getメソッド
	//  Java beansのgetメソッドはgetの後ろに続く文字列が必ず大文字であること
	public String getPlayerName(){ return this.playerName; }
	public String getPlayerSex(){ return this.playerSex; }
	public String getPlayerType(){ return this.playerType; }
	public String getPlayerRubber(){ return this.playerRubber; }

}
