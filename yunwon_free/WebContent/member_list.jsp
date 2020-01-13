<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="baby.diary.domain.*"
	import="java.util.List"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUMMY</title>
<mytag:design />
</head>

<body>
	<mytag:head />
	<div>
		<h6>
			<%
				if ((request.getAttribute("message")) != null) {
			%>
			<div>
				<p id="msg">
					<strong>${message}</strong>
				</p>
			</div>
			<%
				}
			%>
		</h6>
		<table id="tab" class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Mobile</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="mo" items="${memberList }" varStatus="status">
					<c:url value="http://localhost:8080/yunwon_free/BabyServlet" var="nex">
						<c:param name="key" value="update" />
						<c:param name="id" value='${mo.id }' />
					</c:url>
					<tr>
						<th scope="raw">${status.count}</th>
						<td><a style="color: black;" href="${nex}" target="_self">${mo.id}</a></td>
						<td>${mo.username}</td>
						<td>${mo.mobile}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>