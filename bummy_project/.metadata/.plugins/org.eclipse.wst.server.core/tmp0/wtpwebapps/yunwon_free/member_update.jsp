<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="baby.diary.domain.*"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUMMY</title>
<mytag:design />
</head>

<body>
	<mytag:head />
	<!-- 회원 정보 변경 form -->
	<div align="center" style="margin-top: 130px;">
		<h3 id="content">
			<span style="color: #ac8daf">버미</span> 회원 정보 변경
		</h3>
		<h6>
			<%
				if ((request.getAttribute("message")) != null) {
			%>
			<div>
				<p style="color: #484c7f">
					<strong>${message }</strong>
				</p>
			</div>
			<%
				}
			%>
		</h6>
		<br>
		<form action="http://localhost:8080/yunwon_free/BabyServlet"
			method="post">
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="username"
					placeholder="이름" value='${member.username}' readonly>
			</div>
			<br>
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="mobile"
					placeholder="전화번호" value='${member.mobile}' autofocus>
			</div>
			<br>
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="id" placeholder="아이디"
					value='${member.id}'>
			</div>
			<br>
			<div class="form-group col-md-4" style="float: none; margin: auto">
				<input type="text" class="form-control" name="password"
					placeholder="비밀번호" value='${member.password}'>
			</div>
			<br> <br>
			<div>
				<button type="submit" class="btn btn-light" name="key"
					value="update">Change</button>
				&nbsp;&nbsp;
				<c:set value='${id}' var="mem" />
				<c:if test="${mem == 'admin' }">
					<button type="submit" class="btn btn-outline-danger" name="key"
						value="delete">Delete</button>
				</c:if>
			</div>
		</form>
	</div>
</body>
</html>