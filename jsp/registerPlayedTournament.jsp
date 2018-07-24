<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<BODY>
<FORM action="./RegisterPlayedTournament" method="post">
<div class="container">
	<h3 class="page-header">出場大会登録</h3>
	<p class="lead">選手の出場大会を登録できます</p>
</div>
<BR>
選手名↓
<BR>
<INPUT type="text" name="player_name">
<BR>
出場大会名↓
<BR>
<INPUT type="text" name="tournament_name">

<INPUT type="submit" name="OK">
</FORM>
<BR>
<a href="./index.jsp"> トップへ</a>
</BODY>
</HTML>