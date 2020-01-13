<!-- 승범이 지도 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div id="out" style="margin-top:0px;">
		<div id="in">
			<div class="spinner-grow text-primary" role="status"></div>
			<div class="spinner-grow text-secondary" role="status"></div>
			<div class="spinner-grow text-success" role="status"></div>
			<div class="spinner-grow text-danger" role="status"></div>
			<div class="spinner-grow text-warning" role="status"></div>
			<div class="spinner-grow text-info" role="status"></div>
			<div class="spinner-grow text-light" role="status"></div>
			<div class="spinner-grow text-dark" role="status"></div><br>
			
			<span style="color:white; opacity:0.7;">plz waiting, 'll make like pokemon map</span>
		</div>
	</div>
</body>
</html>