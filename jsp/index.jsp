<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	index.jsp
---------------------------------->
<HTML>
<title>卓球戦績システム</title>
<BODY>
<BODY bgcolor="pink">
<div class="container">
	<b><font size="7" class="page-header">卓球戦績システム</font></b>
	<h3 class="lead">卓球の戦績を管理するシステムです！</h3>
	<br>
</div>
<h3 class="lead">●登録</h3>
<a href="./registerTournament.jsp"> 大会</a>
&nbsp;
<a href="./registerPlayer.jsp"> 選手</a>
&nbsp;
<a href="./registerPlayedTournament.jsp"> 出場大会</a>
&nbsp;
<a href="./registerRecord.jsp"> 対戦結果</a>

<BR>
<BR>
<h3 class="lead">●検索</h3>
<a href="./searchTournament.jsp"> 大会</a>
&nbsp;
<a href="./searchPlayer.jsp"> 選手</a>
&nbsp;
<a href="./searchPlayedTournament.jsp"> 出場大会</a>
&nbsp;
<a href="./searchRecord.jsp"> 対戦結果</a>
<BR>
<BR>
<BR>
<hr>
<br>
<a href="./login.jsp"> ログアウト</a>
</BODY>
</HTML>