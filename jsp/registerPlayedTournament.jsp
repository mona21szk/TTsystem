<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title>出場大会登録</title>
<BODY>
<FORM action="./RegisterPlayedTournament" method="post">
<div class="container">
	<h1 class="page-header">出場大会登録</h1>
	<h3 class="lead">選手の出場大会を登録できます</h3>
</div>
<BR>
選手名
<BR>
<INPUT type="text" name="player_name" required>
<BR>
出場大会名
<BR>
<INPUT type="text" name="tournament_name" required>

<button class="btn btn-primary" type="submit">登録</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>