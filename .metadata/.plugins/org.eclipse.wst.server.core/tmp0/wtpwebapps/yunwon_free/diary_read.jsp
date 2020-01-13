<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="baby.diary.domain.*"
	import="java.util.List"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUMMY</title>
<mytag:design/>
</head>

<body>
	<mytag:head/>
	<div id="out">
		<div>
			<table id="tab" class="table">
				<tbody>
					<tr style="background-color: #ac8daf; color: white;">
						<td>제목</td>
						<td>날씨</td>
					</tr>
					<tr>
						<td><br>${baby.title }</td>
						<td><br>${baby.weather }</td>
					</tr>
					<tr class="table-borderless">
						<td></td>
						<td></td>
					</tr>
					<tr style="background-color: #ac8daf; color: white;">
						<td>이야기</td>
						<td>상태</td>
					</tr>
					<tr>
						<td><br>${baby.content }</td>
						<td><br>${baby.state }</td>
					</tr>
					<tr class="table-borderless">
						<td></td>
						<td></td>
					</tr>
					<tr style="background-color: #ac8daf; color: white;">
						<td>너에게</td>
						<td></td>
					</tr>
					<tr>
						<td><br>${baby.self }</td>
						<td></td>
					</tr>
				</tbody>
			</table>
			<%
				if (session.getAttribute("id").equals("admin")) {
			%>
			<form
				action="http://localhost:8080/yunwon_free/BabyServlet?key=delete2"
				method="post">
				<input type="hidden" name="title" value="${baby.title }">
				<input type="hidden" name="weather" value="${baby.weather }">
				<input type="hidden" name="content" value="${baby.content }">
				<input type="hidden" name="state" value="${baby.state }">
				<input type="hidden" name="self" value="${baby.self }">
				<div id="delete">
					<button type="submit" class="btn btn-danger">Delete</button>
				</div>
			</form>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>