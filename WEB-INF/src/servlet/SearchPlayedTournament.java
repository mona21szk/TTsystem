
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.PlayedTournament;
import control.PlayedTournamentManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class SearchPlayedTournament extends HttpServlet{

	/**
	*
	*/
		private static final long serialVersionUID = 1L;

	//  doGetメソッドは使わないので、doPostメソッドへ転送
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request, response);
	}

	//  requestオブジェクトには、フォームで入力された文字列などが格納されている。
	//  responseオブジェクトを使って、次のページを表示する
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		// requestオブジェクトの文字エンコーディングの設定
		request.setCharacterEncoding("UTF-8");

		// requestオブジェクトから登録情報の取り出し
		String player_name = request.getParameter("player_name");
		if(player_name==""  ) {
			getServletContext().getRequestDispatcher("/jsp/searchPlayedTournament.jsp").forward(request, response);
		}
		else {

		String tournament_name = null;

		// playedtournamentのオブジェクトに情報を格納
		PlayedTournament playedtournament = new PlayedTournament(player_name,tournament_name);

		//  PlayedTournamentManagerオブジェクトの生成
		PlayedTournamentManager manager = new PlayedTournamentManager();

		//  出場大会の検索

		playedtournament= manager.searchPlayedTournament(playedtournament);
		//  requestオブジェクトにオブジェクトを登録
		request.setAttribute("PlayedTournament", playedtournament);

		if( playedtournament==null ) {
			getServletContext().getRequestDispatcher("/jsp/searchPlayedTournament.jsp").forward(request, response);
		}
		else {
		//  情報表示画面を表示する
		//  forwardはrequestオブジェクトを引数として、次のページに渡すことができる
		getServletContext().getRequestDispatcher("/jsp/showPlayedTournament.jsp").forward(request, response);
		}
	}}
}