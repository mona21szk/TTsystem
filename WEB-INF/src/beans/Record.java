
//  自分が格納されているフォルダ名
package beans;

public class Record {

	//  属性

	private String playerName = null;			//　選手名
	private String tournamentName = null;			//　大会名
	private String battleDay = null;		//	対戦日
	private String battleCount = null;		//	カウント
	private String battleStage = null;		//	対戦位置



	//　初期値を引数に持ったコンストラクタ
	public Record(String playerName, String tournamentName, String battleDay,String battleCount,String battleStage){


		this.playerName = playerName;
		this.tournamentName = tournamentName;
		this.battleDay = battleDay;
		this.battleCount = battleCount;
		this.battleStage = battleStage;


	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public Record(){}

	//  setメソッド
	//  Java beansのsetメソッドはsetの後ろに続く文字列が必ず大文字であること

	public void setPlayerName(String playerName){ this.playerName = playerName; }
	public void setTournamentName(String tournamentName){ this.tournamentName = tournamentName; }
	public void setBattleDay(String battleDay){ this.battleDay = battleDay; }
	public void setBattleCount(String battleCount){ this.battleCount = battleCount; }
	public void setBattleStage(String battleStage){ this.battleStage = battleStage; }


	//  getメソッド
	//  Java beansのgetメソッドはgetの後ろに続く文字列が必ず大文字であること

	public String getPlayerName(){ return this.playerName; }
	public String getTournamentName(){ return this.tournamentName; }
	public String getBattleDay(){ return this.battleDay; }
	public String getBattleCount(){ return this.battleCount; }
	public String getBattleStage(){ return this.battleStage; }

}
