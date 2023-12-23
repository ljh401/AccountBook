<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class = "webcontainer"> <!-- 로그인 전체 구역 -->
		<form class = "signupForm"> <!-- 폼 전송시 각 input에 name -->
					
			<div class = "intitle">아이디</div>
			<input maxlength = "30" name = "mid" class = "mid" type = "text" />
			

			 
			<div class = "intitle">비밀번호</div>
			<input maxlength = "20" name = "mpwd" class = "mpwd" type = "password" />
			
			<button class = "signupbtn" onclick = "login()" type = "button">로그인</button>
			
			<div class = "logincheckbox"><!-- 로그인 유효성 검사 구역 -->
			
			</div>
			
			
			
			<div class = "findbtnbox"> <!-- 회원가입 페이지 이동 /아이디/비밀번호 찾기 구역 -->
				<a href ="/AccountBook/join.jsp">회원가입 |</a>
				<a href ="/AccountBook/findId.jsp">아이디찾기 |</a>
				<a href ="/AccountBook/findPw.jsp">비밀번호찾기</a>
			</div>
			
			
			
		</form>
	</div> 
</body>
</html>