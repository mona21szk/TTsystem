<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<!-- CSS -->
<!--<link rel="stylesheet" href="/hazelabBBS/css/bootstrap.min.css"> -->
<!-- <link  rel="stylesheet" href="/hazelabBBS/font/css/open-iconic-bootstrap.css"> -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>
<body bgcolor="pink">

<!-- コンテンツ -->
<div class="container">
	<h1 class="page-header">ログイン</h1>
	<form action="./SearchUser" method ="post">
		<div class="form-group">
			<label for="userId" >ログインID</label>
			<input class="form-control" type="text" name="user_id" id="user_id">
		</div>
		<div class="form-group">
			<label for="password">パスワード</label>
			<input class="form-control" type="password" name="password" id="password" >
		</div>
		<button class="btn btn-primary" type="submit">ログイン</button>

	</form>
	<br>
<hr>
	<br>
	利用者登録は<a href="./registerUser.jsp">こちら</a>から

</div>
<!-- javascript -->
<script type="text/javascript" src="/hazelabBBS/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/hazelabBBS/js/bootstrap.min.js"></script>
</body>
</html>