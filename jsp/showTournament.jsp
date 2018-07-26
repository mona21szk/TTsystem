<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Tournamentをimportする -->
<%@ page import= "beans.Tournament" %>


<html>
<head><title>結果</title></head>

<body bgcolor="gold">
<br>

<table border="1" width="100%">
	<tr>
		<td width = "40%"> <center>大会名</center> </td>
		<td width = "60%"> <center>${Tournament.tournamentName} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>期間</center> </td>
		<td width = "60%"> <center>${Tournament.tournamentTerm1}～ ${Tournament.tournamentTerm2} </center> </td>

	</tr>
	<tr>
		<td width = "40%"> <center>場所</center> </td>
		<td width = "60%"> <center>${Tournament.tournamentPlace} </center> </td>
	</tr>
</table>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
<br>
</body>
</html>