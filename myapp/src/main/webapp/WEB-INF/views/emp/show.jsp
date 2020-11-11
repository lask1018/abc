<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 조회 페이지</title>
</head>
<body>
<h1>부서 정보</h1>
<a href="/myapp/emp">메인페이지</a><br>
<table border=1>
<td>부서정보 : ${show}</td>
</table>
</body>
</html>