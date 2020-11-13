<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h3>${message}</h3>
<BR><BR>	
<a href="emp/count"><button>1. 사원의 수</button></a>
<form action="emp/count">
검색하려는 부서 번호를 입력하세요 : <input type=text name=deptId>
<input type=submit value=검색>
</form>
<br>
<a href="emp/list"><button>2. 사원 목록</button></a><br>
<br>
<a href="/myapp/emp"><button>3. 부서 정보 검색</button></a>
<form action="emp/show">
목록을 출력하려는 부서 번호를 입력하세요. : <input type=text name=deptId>
<input type=submit value=검색>
</form>
<form action="emp/nameSearch">
2. 이름 검색 : <input type=text name=name>&nbsp;<input type=submit value="검색"><br>
</form>
<form action="logout.do" method="post">
<input type=submit value=로그아웃>
</form><br>
</body>
</html>
