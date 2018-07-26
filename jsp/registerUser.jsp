<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title>利用者登録</title>

<body bgcolor="pink">
<FORM action="./RegisterUser" method="post">
<div class="container">

	<h1 class="page-header">利用者登録</h1>

</div>



ログインIDは<b>15文字以内</b>、パスワードは<b>10文字以内</b>の<b>半角</b>で設定してください。

<br>
<br>
<br>
ログインID
<INPUT type="text" name="user_id" id="user_id" maxlength='15' required>
<BR>
パスワード
<INPUT type="text" name="password" id="password" maxlength='10' required>

<button class="btn btn-primary" type="submit">登録</button>
</FORM>
<hr>
<BR>
<a href="./login.jsp"> ログイン画面へ戻る</a>
</BODY>
</HTML>