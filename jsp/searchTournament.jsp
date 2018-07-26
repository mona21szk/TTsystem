<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	SearchTournament.jsp
---------------------------------->
<HTML>
<title>大会検索</title>
<h1 class="page-header">大会検索</h1>

<BODY>
大会名
<FORM action="./SearchTournament" method="post">
<INPUT type="text" name="tournament_name">
<button class="btn btn-primary" type="submit">検索</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>