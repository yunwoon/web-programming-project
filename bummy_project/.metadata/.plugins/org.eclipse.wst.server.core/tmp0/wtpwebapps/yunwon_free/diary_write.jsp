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
	<div id="out">
		<div id="in">
			<form
				action="http://localhost:8080/yunwon_free/BabyServlet?key=write"
				method="post">
				<div id="diary">
					<div class="form-group">
						<label id = "lab" for="inputTitle">Title</label> <input type="text"
							class="form-control" id="inputTitle" name="title" autofocus>
					</div><br>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label id = "lab" for="inputWeather">Weather</label> <select
								class="form-control" id="inputWeather" name="weather">
								<option>warm</option>
								<option>cool</option>
								<option>cold</option>
								<option>rainy</option>
								<option>snowy</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label id = "lab" for="inputState">State</label> <select
								class="form-control" id="inputState" name="state">
								<option>happy</option>
								<option>delighted</option>
								<option>joyful</option>
								<option>quiet</option>
								<option>nervous</option>
							</select>
						</div>
					</div><br>
					<div class="form-group">
						<label id = "lab" for="inputContent">Content</label>
						<textarea class="form-control" id="inputContent" rows="4"
							name="content"></textarea>
					</div><br>
					<div class="form-group">
						<label id = "lab" for="inputSelf">To Baby</label> <input type="text"
							class="form-control" id="inputSelf" name="self">
					</div>
				</div>
				<br>
				<div>
					<button type="submit" class="btn btn-outline-dark">Done</button>
					&nbsp;&nbsp;
					<button type="reset" class="btn btn-dark">Again</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>