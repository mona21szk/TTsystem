<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<BODY>
<FORM action="./RegisterRecord" method="post">
<div class="container">
	<h3 class="page-header">対戦結果登録</h3>
	<p class="lead">対戦結果を登録できます</p>
</div>
<BR>
選手名↓
<BR>
<INPUT type="text" name="player_name">
<BR>
大会名↓
<BR>
<INPUT type="text" name="tournament_name">
<BR>
対戦日↓
<BR>
<INPUT type="text" name="day">
<BR>
ゲームカウント↓(2-3のように入力してください)
<BR>
<INPUT type="text" name="count">
<BR>
対戦位置↓
<BR>
<INPUT type="text" name="stage">


<INPUT type="submit" name="OK">
</FORM>
<BR>
<a href="./index.jsp"> トップへ</a>
</BODY>
</HTML>