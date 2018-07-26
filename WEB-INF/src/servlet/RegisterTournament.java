//--------------------------------
//	RegisterTournament.java
//--------------------------------
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Tournament;
import control.TournamentManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class RegisterTournament extends HttpServlet{

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
		String tournament_name = request.getParameter("tournament_name");
		String term1 = request.getParameter("term1");
		String term2 = request.getParameter("term2");
		String place = request.getParameter("place");

		System.out.println("取得した文字列は"+tournament_name+"です！");
		System.out.println("取得した文字列は"+term1+"です！");
		System.out.println("取得した文字列は"+term2+"です！");
		System.out.println("取得した文字列は"+place+"です！");


		if(tournament_name=="" ) {
			getServletContext().getRequestDispatcher("/jsp/registerTournament.jsp").forward(request, response);
		}
		else {


		// tournamentオブジェクトに情報を格納
		Tournament tournament = new Tournament(tournament_name, term1,term2, place);

		//  TournamentManagerオブジェクトの生成
		TournamentManager manager = new TournamentManager();

		//  登録
		manager.registerTournament(tournament);

		if(tournament_name=="" ) {
			getServletContext().getRequestDispatcher("/jsp/registerTournament.jsp").forward(request, response);
		}
		else {
		//  成功画面を表示する
		//System.out.println("登録できました！");
		response.sendRedirect(response.encodeRedirectURL("./registerSuccess.jsp"));
		}
	}
	}
}