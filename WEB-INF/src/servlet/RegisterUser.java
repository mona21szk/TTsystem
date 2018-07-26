
//　自分が格納されているフォルダ名
package servlet;

//自分が格納されているフォルダの外にある必要なクラス
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import control.UserManager;

	//HttpServletを継承することで、このクラスはServletとして、働くことができる
	public class RegisterUser extends HttpServlet{

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
		String user_id = request.getParameter("user_id");
		String password = request.getParameter("password");


		System.out.println("取得した文字列は"+user_id+"です！");
		System.out.println("取得した文字列は"+password+"です！");


		if(user_id=="" || password=="" ) {
			getServletContext().getRequestDispatcher("/jsp/registerPlayedTournament.jsp").forward(request, response);
		}
		else {


		// userオブジェクトに情報を格納
		User user = new User(user_id, password);

		//  UserManagerオブジェクトの生成
		UserManager manager = new UserManager();

		//  登録
		manager.registerUser(user);

		if(user_id=="" || password=="") {
			getServletContext().getRequestDispatcher("/jsp/registerUser.jsp").forward(request, response);
		}
		else {
		//  成功画面を表示する
		System.out.println("登録できました！");
		response.sendRedirect(response.encodeRedirectURL("./registerUserSuccess.jsp"));
		}
	}
	}
}