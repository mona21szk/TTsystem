<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<BODY>
<div class="container">
	<h3 class="page-header">対戦結果の検索</h3>
	<p class="lead">大会名と対戦相手を入力してください！</p>
</div>
<FORM action="./SearchRecord" method="post">
<BR>
大会名↓
<BR>
<INPUT type="text" name="tournament_name">
<BR>
対戦相手の選手名↓
<BR>
<INPUT type="text" name="player_name">
<INPUT type="submit" name="OK">
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>