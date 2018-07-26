<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Playerをimportする -->
<%@ page import= "beans.PlayedTournament" %>


<html>
<head><title>結果</title></head>

<body bgcolor="gold">
<br>

<table border="1" width="100%">
	<tr>
		<td width = "40%"> <center>選手名</center> </td>
		<td width = "60%"> <center>${PlayedTournament.playerName} </center> </td>
	</tr>

</table>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
<br>
</body>
</html>