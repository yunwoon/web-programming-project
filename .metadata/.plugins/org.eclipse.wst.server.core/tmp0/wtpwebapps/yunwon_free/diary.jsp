<!-- 승범이 일기 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="baby.diary.domain.*"
	import="java.util.List"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL taglib 사용 -->
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
			<table id="tab" class="table table-hover">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">TITLE</th>
						<th scope="col">STATE</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="vo" items ="${babyList}" varStatus ="status">
					<c:url value="http://localhost:8080/yunwon_free/BabyServlet" var="next">
						<c:param name="key" value="read"/>
						<c:param name="date" value='${vo.date }'/>
					</c:url>
					<tr>
						<th scope="row">${status.count}</th>
						<td><a href="${next}" target="_self" style="color:black;">${vo.title}</a></td>
						<td>${vo.state }</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="write">
			<button type="button" class="btn btn-outline-dark"
				onclick="location.href='http://localhost:8080/yunwon_free/BabyServlet?key=write'">Write</button>
		</div>
	</div>
</body>
</html>