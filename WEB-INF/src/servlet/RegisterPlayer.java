//--------------------------------
//	RegisterPlayer.java
//--------------------------------
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Player;
import control.PlayerManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class RegisterPlayer extends HttpServlet{

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
		String sex = request.getParameter("sex");
		String type = request.getParameter("type");
		String rubber = request.getParameter("rubber");

		System.out.println("取得した文字列は"+player_name+"です！");
		System.out.println("取得した文字列は"+sex+"です！");
		System.out.println("取得した文字列は"+type+"です！");
		System.out.println("取得した文字列は"+rubber+"です！");

		// playerオブジェクトに情報を格納
		Player player = new Player(player_name, sex, type,rubber);

		//  PlayerManagerオブジェクトの生成
		PlayerManager manager = new PlayerManager();

		//  登録
		manager.registerPlayer(player);

		//  成功画面を表示する
		//System.out.println("登録できました！");
		response.sendRedirect(response.encodeRedirectURL("./registerSuccess.jsp"));
		}
}