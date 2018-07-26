<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<h2><title>選手登録</title></h3>
<BODY>
<FORM action="./RegisterPlayer" method="post">
<div class="container">
	<h1 class="page-header">選手登録</h1>
	<h3 class="lead">選手を登録できます</h3>
</div>
<BR>
選手名
<BR>
<INPUT type="text" name="player_name" required>
<BR>
性別(女性なら「女」、男性なら「男」と入力してください。)
<BR>
<INPUT type="text" name="sex">
<BR>
戦型
<BR>
<INPUT type="text" name="type">
<BR>
ラバーの種類
<BR>
<INPUT type="text" name="rubber">

<button class="btn btn-primary" type="submit">登録</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>