
//  自分が格納されているフォルダ名
package beans;

public class PlayedTournament {

	//  属性
	private String playerName = null;			//　選手名
	private String tournamentName = null;			//　大会名




	//　初期値を引数に持ったコンストラクタ
	public PlayedTournament(String playerName, String tournamentName){

		this.playerName = playerName;
		this.tournamentName = tournamentName;


	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public PlayedTournament(){}

	//  setメソッド
	//  Java beansのsetメソッドはsetの後ろに続く文字列が必ず大文字であること
	public void setPlayerName(String playerName){ this.playerName = playerName; }
	public void setTournamentName(String tournamentName){ this.tournamentName = tournamentName; }

	//  getメソッド
	//  Java beansのgetメソッドはgetの後ろに続く文字列が必ず大文字であること
	public String getPlayerName(){ return this.playerName; }
	public String getTournamentName(){ return this.tournamentName; }


}
