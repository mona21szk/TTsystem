<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<BODY>
<FORM action="./RegisterPlayer" method="post">
<div class="container">
	<h3 class="page-header">選手登録</h3>
	<p class="lead">選手を登録できます</p>
</div>
<BR>
選手名↓
<BR>
<INPUT type="text" name="player_name">
<BR>
性別↓(女性なら「女」、男性なら「男」と入力してください。)
<BR>
<INPUT type="text" name="sex">
<BR>
戦型↓
<BR>
<INPUT type="text" name="type">
<BR>
ラバーの種類↓
<BR>
<INPUT type="text" name="rubber">

<INPUT type="submit" name="OK">
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>