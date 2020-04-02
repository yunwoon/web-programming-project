<!-- 승범이 가족 소개 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUMMY</title>
<mytag:design />
</head>

<body>
	<mytag:head />
	<div id="out" style="margin-top: 0px;">
		<div id="in">
			<div id="fam" class="row mb-2">
				<div class="col-md-6">
					<div
						class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
						<div class="col p-4 d-flex flex-column position-static">
							<br> <strong class="d-inline-block mb-2 text-dark">Mom</strong>
							<h3 id="bold" class="mb-0">김 은 화</h3>
							<div class="mb-1 text-muted">May 29</div>
							<p class="card-text mb-auto">She is our mother. umm, very
								strong and kind to us. all of my life is her.</p>
						</div>
						<div class="col-auto d-none d-lg-block">
							<img src="resources/img/mom.jpg" width="200" height="250">
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div
						class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
						<div class="col p-4 d-flex flex-column position-static">
							<br> <strong class="d-inline-block mb-2 text-dark">Dad</strong>
							<h3 id="bold" class="mb-0">채 수 원</h3>
							<div class="mb-1 text-muted">Dec 28</div>
							<p class="mb-auto">He is our father. has too much information
								and knowledge. specially, master of history.</p>
						</div>
						<div class="col-auto d-none d-lg-block">
							<img src="resources/img/dad.jpg" width="200" height="250">
						</div>
					</div>
				</div>
			</div>

			<div id="fam" class="row mb-2">
				<div class="col-md-6">
					<div
						class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
						<div class="col p-4 d-flex flex-column position-static">
							<br> <strong class="d-inline-block mb-2 text-dark">First</strong>
							<h3 id="bold" class="mb-0">채 윤 원</h3>
							<div class="mb-1 text-muted">Feb 26</div>
							<p class="card-text mb-auto">It's me. I like making web-page,
								and developing but i don't like doing homework,,</p>
						</div>
						<div class="col-auto d-none d-lg-block">
							<img src="resources/img/me.jpg" width="200" height="250">
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div
						class="row no-gutters border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative">
						<div class="col p-4 d-flex flex-column position-static">
							<br> <strong class="d-inline-block mb-2 text-dark">Second</strong>
							<h3 id="bold" class="mb-0">채 주 원</h3>
							<div class="mb-1 text-muted">Oct 27</div>
							<p class="mb-auto">She is my younger sister. has talent to
								draw picture. she makes me happy and delighted!</p>
						</div>
						<div class="col-auto d-none d-lg-block">
							<img src="resources/img/sister.jpg" width="200" height="250">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>