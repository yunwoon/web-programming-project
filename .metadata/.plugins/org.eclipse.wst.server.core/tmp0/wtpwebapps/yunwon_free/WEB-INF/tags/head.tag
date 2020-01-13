<!-- 모든 페이지 공통 헤더 -->
<%@ tag language="java" body-content="tagdependent" pageEncoding="UTF-8"%>

<div style="margin-top: 20px;" align="center">
	<a href="main.jsp" target="_self"> <img
		src="resources/img/temp.png" height="70px" alt="welcome page" />
	</a><br>
</div>
<div>
	<form action="http://localhost:8080/yunwon_free/BabyServlet?key=logout"
		method="post">
		<h4 id="content2">
			${sessionScope.id}님, 환영합니다!&nbsp;&nbsp;
			<button type="submit" class="btn btn-outline-light"
				style="margin-right: 70px;">Logout</button>
	</form>
	</h4>
</div>
<header>
	<div class="navbar-nav-scroll" style="margin-right: 60px;">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active li_col"
				href="main.jsp">HOME</a></li>
			<li class="nav-item"><a class="nav-link li_col"
				href="baby_family.jsp">FAMILY</a></li>
			<li class="nav-item"><a class="nav-link li_col"
				href="baby_life.jsp">LIFE</a></li>
			<li class="nav-item"><a class="nav-link li_col"
				href="http://localhost:8080/yunwon_free/BabyServlet?key=diary"
				target="_self">DIARY</a></li>
			<li class="nav-item"><a class="nav-link li_col"
				href="baby_album.jsp">ALBUM</a></li>
			<li class="nav-item"><a class="nav-link li_col"
				href="baby_map.jsp">MAP</a></li>
			<%
					if (session.getAttribute("id").equals("admin")) {
			%>
			<li class="nav-item"><a class="nav-link li_col"
				href="http://localhost:8080/yunwon_free/BabyServlet?key=list"
				target="_self" style="color: #484c7f;">ADMIN</a></li>
			<%
					}
			%>
		</ul>
	</div>
</header>