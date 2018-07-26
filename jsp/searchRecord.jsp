<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title>対戦結果検索</title>
<BODY>
<div class="container">
	<h1 class="page-header">対戦結果の検索</h1>
	<h3 class="lead">対戦結果の検索をします！</h3>
</div>
<FORM action="./SearchRecord" method="post">

<BR>
大会名
<BR>
<INPUT type="text" name="tournament_name" required>
<BR>
対戦相手の選手名
<BR>
<INPUT type="text" name="player_name" required>
<BR>
<BR>
あなたの名前
<BR>
<INPUT type="text" name="user_name" required>
<button class="btn btn-primary" type="submit">検索</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>