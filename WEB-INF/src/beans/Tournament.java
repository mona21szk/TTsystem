
//  自分が格納されているフォルダ名
package beans;

public class Tournament {

	//  属性
	private String tournamentName = null;			//　大会名
	private String tournamentTerm1 = null;			//　期間1
	private String tournamentTerm2 = null;			//　期間2
	private String tournamentPlace = null;		//	場所



	//　初期値を引数に持ったコンストラクタ
	public Tournament(String tournamentName, String tournamentTerm1, String tournamentTerm2,String tournamentPlace){

		this.tournamentName = tournamentName;
		this.tournamentTerm1 = tournamentTerm1;
		this.tournamentTerm2 = tournamentTerm2;
		this.tournamentPlace = tournamentPlace;

	}

	//  初期値を引数に持たないコンストラクタ
	//  Java beansは初期値を持たないコンストラクタが必ず必要
	public Tournament(){}

	//  setメソッド
	//  Java beansのsetメソッドはsetの後ろに続く文字列が必ず大文字であること
	public void setTournamentName(String tournamentName){ this.tournamentName = tournamentName; }
	public void setTournamentTerm1(String tournamentTerm1){ this.tournamentTerm1 = tournamentTerm1; }
	public void setTournamentTerm2(String tournamentTerm2){ this.tournamentTerm2 = tournamentTerm2; }
	public void setTournamentPlace(String tournamentPlace){ this.tournamentPlace = tournamentPlace; }

	//  getメソッド
	//  Java beansのgetメソッドはgetの後ろに続く文字列が必ず大文字であること
	public String getTournamentName(){ return this.tournamentName; }
	public String getTournamentTerm1(){ return this.tournamentTerm1; }
	public String getTournamentTerm2(){ return this.tournamentTerm2; }
	public String getTournamentPlace(){ return this.tournamentPlace; }

}
