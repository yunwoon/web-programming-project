<!-- 메인 페이지 -->
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
	<mytag:head />
	<div style="margin-top: 50px;">
		<div id="exp">
			<!-- 왼쪽 컨텐츠 -->
			<div id="in">
				<img src="resources/img/text.png" height="270px;" /><br> <br>
				<button type="button" class="btn btn-light">show</button>
				&nbsp;&nbsp;
				<button type="button" class="btn btn-outline-light"
					style="margin-right: 460px;">baby</button>
			</div>
		</div>
		<div id="pho">
			<!-- 오른쪽 컨텐츠 -->
			<div id="in">
				<div id="carouselExampleIndicators" class="carousel slide"
					data-ride="carousel" style="margin-right:50xpx;">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0"
							class="active"></li>
						<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					</ol>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="resources/img/img1.png" width="100px;"
								class="d-block w-100">
						</div>
						<div class="carousel-item">
							<img src="resources/img/img2.png" width="100px;"
								class="d-block w-100">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleIndicators"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>