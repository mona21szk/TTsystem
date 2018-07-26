<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title>対戦結果登録</title>
<BODY>
<FORM action="./RegisterRecord" method="post">
<div class="container">
	<h1 class="page-header">対戦結果登録</h1>
	<h3 class="lead">対戦結果を登録できます！</h3>
</div>

<BR>
<BR>
対戦選手名
<BR>
<INPUT type="text" name="player_name" required>
<BR>
大会名
<BR>
<INPUT type="text" name="tournament_name" required>
<BR>
対戦日
<BR>
<INPUT type="date" name="day">
<BR>
ゲームカウント(2-3のように入力してください。自分のカウントが先に来るようにしてください。)
<BR>
<INPUT type="text" name="count"maxlength='3'>
<BR>
対戦位置
<BR>
<INPUT type="text" name="stage">
<BR>
<BR>
あなたの名前
<BR>
<INPUT type="text" name="user_name" required>


<button class="btn btn-primary" type="submit">登録</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>