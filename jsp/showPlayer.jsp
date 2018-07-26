<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Playerをimportする -->
<%@ page import= "beans.Player" %>


<html>
<head><title>結果</title></head>

<body bgcolor="gold">
<br>

<table border="1" width="100%">
	<tr>
		<td width = "40%"> <center>選手名</center> </td>
		<td width = "60%"> <center>${Player.playerName} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>性別</center> </td>
		<td width = "60%"> <center>${Player.playerSex} </center> </td>

	</tr>
	<tr>
		<td width = "40%"> <center>戦型</center> </td>
		<td width = "60%"> <center>${Player.playerType} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>ラバーの種類</center> </td>
		<td width = "60%"> <center>${Player.playerRubber} </center> </td>
	</tr>
</table>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
<br>
</body>
</html>