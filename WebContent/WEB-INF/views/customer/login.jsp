<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>은행 관리 시스템</title>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h2>로그인</h2>
	<form id="login_form" action="<%=request.getContextPath()%>/customer.do">
		ID<input type="text" name="id"/> <br/>
		PASS<input type="password" name="pw"/> <br/>
		<input type="hidden" name="action" value="login"/>	
		<input type="hidden" name="page" value="mypage" />
		<input type="submit" value="전송" />
	</form>
</div>
<script>
$('#login_form').submit(function () {
		alert('제출중');
	
});
</script>
</body>

</html>