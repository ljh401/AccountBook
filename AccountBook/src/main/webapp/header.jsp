<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div id = "header">
		<!-- <div class = "mainlogo">로고
			<a href = "/jspweb/index.jsp">
				<img alt="" src="/jspweb/img/ezenlogo.png" />
			</a>
		</div> -->
		<ul class = "mainmenu"><!-- 본메뉴 -->
			<li>OOO님</li>
			<li> <a href ="/AccountBook/myPage.jsp">마이페이지</a> </li>
			<li> <a href ="#">로그아웃</a> </li>
		</ul>
		<ul class = "submenu"><!-- 서브메뉴 -->

			<li> <a href ="/AccountBook/write.jsp">가계부 작성</a> </li>
			<li> <a href ="/AccountBook/one.jsp">일일 가계부</a> </li>
			<li> <a href ="/AccountBook/month.jsp">월별 가계부</a> </li>
			<li> <a href ="/AccountBook/category.jsp">항목 관리</a> </li>
			<li> <a href ="/AccountBook/statistics.jsp">통계</a> </li>
			<!-- <li> <img class ="hmimg" src ="/jspweb/member/img/default.webp"> </li> -->
		</ul>
	</div>
</body>
</html>