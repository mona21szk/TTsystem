<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title >大会登録</title>
<BODY>
<FORM action="./RegisterTournament" method="post">
<div class="container">
	<h1 class="page-header">大会登録</h1>
	<h3 class="lead">大会を登録できます</h3>
</div>
<BR>
大会名
<BR>
<INPUT type="text" name="tournament_name" required>
<BR>
期間(2018/7/2～2018/7/5のように入力してください。)
<BR>
<INPUT type="date" name="term1">～<INPUT type="date" name="term2">
<BR>
開催場所
<BR>
<INPUT type="text" name="place">
<button class="btn btn-primary" type="submit">登録</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>