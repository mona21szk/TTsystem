<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title>出場大会検索</title>
<BODY>
選手名による検索<BR>
<FORM action="./SearchPlayedTournament" method="post">
<INPUT type="text" name="player_name">
<button class="btn btn-primary" type="submit">検索</button>
</FORM>
<BR>
大会名による検索<BR>
<FORM action="./SearchPlayedTournament2" method="post">
<INPUT type="text" name="tournament_name">
<button class="btn btn-primary" type="submit">検索</button>
</FORM>
<BR>

<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>