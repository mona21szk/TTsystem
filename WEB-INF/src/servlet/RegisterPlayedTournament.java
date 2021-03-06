//--------------------------------
//	RegisterPlayedTournament.java
//--------------------------------
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
	public class RegisterPlayedTournament extends HttpServlet{

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
		String tournament_name = request.getParameter("tournament_name");


		System.out.println("取得した文字列は"+player_name+"です！");
		System.out.println("取得した文字列は"+tournament_name+"です！");
		if(player_name=="" || tournament_name=="" ) {
			getServletContext().getRequestDispatcher("/jsp/registerPlayedTournament.jsp").forward(request, response);
		}
		else {

		// playedtournamentオブジェクトに情報を格納
		PlayedTournament played_tournament = new PlayedTournament(player_name, tournament_name);

		//  PlayedTournamentManagerオブジェクトの生成
		PlayedTournamentManager manager = new PlayedTournamentManager();

		//  登録
		manager.registerPlayedTournament(played_tournament);

		if(player_name=="" || tournament_name=="" ) {
			getServletContext().getRequestDispatcher("/jsp/registerPlayedTournament.jsp").forward(request, response);
		}
		else {
		//  成功画面を表示する
		System.out.println("登録できました！");
		response.sendRedirect(response.encodeRedirectURL("./registerSuccess.jsp"));
		}
	}
	}
}