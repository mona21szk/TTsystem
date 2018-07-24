<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<BODY>
<FORM action="./RegisterTournament" method="post">
<div class="container">
	<h3 class="page-header">大会登録</h3>
	<p class="lead">大会を登録できます</p>
</div>
<BR>
大会名↓
<BR>
<INPUT type="text" name="tournament_name">
<BR>
期間↓(2018/7/2～2018/7/5のように入力してください。)
<BR>
<INPUT type="text" name="term1">～<INPUT type="text" name="term2">
<BR>
開催場所↓
<BR>
<INPUT type="text" name="place">
<INPUT type="submit" name="OK">
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>