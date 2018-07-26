//--------------------------------
//	RegisterRecord.java
//--------------------------------
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Record;
import control.RecordManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class RegisterRecord extends HttpServlet{

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
		String day= request.getParameter("day");
		String count = request.getParameter("count");
		String stage = request.getParameter("stage");
		String user_name = request.getParameter("user_name");


		System.out.println("取得した文字列は"+player_name+"です！");
		System.out.println("取得した文字列は"+tournament_name+"です！");
		System.out.println("取得した文字列は"+day+"です！");
		System.out.println("取得した文字列は"+count+"です！");
		System.out.println("取得した文字列は"+stage+"です！");
		System.out.println("取得した文字列は"+user_name+"です！");


		if(player_name=="" || tournament_name==""|| user_name=="" ) {
			getServletContext().getRequestDispatcher("/jsp/registerPlayedTournament.jsp").forward(request, response);
		}
		else {


		// recordオブジェクトに情報を格納
		Record record = new Record(player_name,tournament_name , day,count,stage,user_name);

		//  RecordManagerオブジェクトの生成
		RecordManager manager = new RecordManager();

		//  登録
		manager.registerRecord(record);

		if(player_name=="" || tournament_name=="" || user_name=="") {
			getServletContext().getRequestDispatcher("/jsp/registerRecord.jsp").forward(request, response);
		}
		else {
		//  成功画面を表示する
		System.out.println("登録できました！");
		response.sendRedirect(response.encodeRedirectURL("./registerSuccess.jsp"));
		}
	}
	}
}