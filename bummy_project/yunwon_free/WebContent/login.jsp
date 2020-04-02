<!-- 로그인 페이지   -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="baby.diary.domain.*" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUMMY</title>
<mytag:design/>
</head>

<body>
	<div style="margin-top: 20px;" align="center">
		<a href="http://localhost:8080/yunwon_free/index.html" target="_self">
			<img src="resources/img/temp.png" height="70px" alt="welcome page" />
		</a><br>
	</div>
	<div align="center" style="margin-top: 200px;">
		<%
			if((request.getAttribute("errmsg")) != null){
		%>
		<div>
			<p style="color:salmon"><strong>${errmsg} </strong></p>
		</div>
		<% } %>
		<form action="http://localhost:8080/yunwon_free/BabyServlet?key=login"
			method="post">
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<label for="InputID">ID</label> <input type="text"
					class="form-control" name="id"
					placeholder="show your industrial design" autofocus> <small
					class="form-text text-muted">We'll never share your
					information with anyone else.</small>
			</div>
			<br>

			<div class="form-group col-md-4" style="float: none; margin: auto">
				<label for="InputPassword">Password</label> <input type="password"
					class="form-control" name="password" placeholder="Password"><br>
				<br>
			</div>
			<button type="submit" class="btn btn-outline-light">Login</button>
			&nbsp;&nbsp;
			<button type="reset" class="btn btn-outline-light">Again</button>
		</form>
	</div>
</body>
</html>