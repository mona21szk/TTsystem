<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<HTML>
<title>選手検索</title>
<h1 class="page-header">選手検索</h1>
<BODY>

選手名による検索<BR>
<FORM action="./SearchPlayer" method="post">
<INPUT type="text" name="player_name" required>
<button class="btn btn-primary" type="submit">検索</button>
</FORM>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
</BODY>
</HTML>