<!-- 회원가입 페이지   -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="baby.diary.domain.*"%>
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
	<div align="center" style="margin-top: 150px;">
		<% if((request.getAttribute("errmsg")) != null){ %>
		<div>
			<p style="color: salmon"><strong>${errmsg}</strong></p>
		</div>
		<% } %>
		<h3 id="content">
			<span style="color: #ac8daf">버미</span> 회원가입
		</h3>
		<h6 id="content">
			<cite>하나의 아이디로 버미의 다양한 이야기를 들어 보세요.</cite><br> <br>
		</h6>
		<br>
		<form action="http://localhost:8080/yunwon_free/BabyServlet?key=join"
			method="post">
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="username"
					placeholder="이름" autofocus>
			</div>
			<br>
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="mobile"
					placeholder="전화번호">
			</div>
			<br>
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="id" placeholder="아이디">
			</div>
			<br>
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="password" class="form-control" name="password"
					placeholder="비밀번호"><br>
			</div>
			<div>
				<button type="submit" class="btn btn-outline-light">Sign up</button>
				&nbsp;&nbsp;
				<button type="reset" class="btn btn-outline-light">Again</button>
			</div>
		</form>
		<br> <br>
		<hr color="white" width="30%">
		<span style="color: white;">이미 가입하셨다면?&nbsp;&nbsp;</span> <a
			href="http://localhost:8080/yunwon_free/login.jsp" target="_self"
			style="color: white">로그인</a>
	</div>
</body>
</html>