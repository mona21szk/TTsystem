<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- beans.Tournamentをimportする -->
<%@ page import= "beans.Record" %>


<html>
<head><title>結果</title></head>

<body bgcolor="yellow">
<br>

<table border="1" width="100%">
	<tr>
		<td width = "40%"> <center>対戦選手名</center> </td>
		<td width = "60%"> <center>${Record.playerName} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>大会名</center> </td>
		<td width = "60%"> <center>${Record.tournamentName} </center> </td>

	</tr>
	<tr>
		<td width = "40%"> <center>対戦日</center> </td>
		<td width = "60%"> <center>${Record.battleDay} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>ゲームカウント</center> </td>
		<td width = "60%"> <center>${Record.battleCount} </center> </td>
	</tr>
	<tr>
		<td width = "40%"> <center>対戦位置</center> </td>
		<td width = "60%"> <center>${Record.battleStage} </center> </td>
	</tr>

</table>
<BR>
<a href="./index.jsp"> トップへ戻る</a>
<br>
</body>
</html>