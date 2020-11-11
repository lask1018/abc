<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Emp${message}</title>
</head>
<body>
<h1>사원 정보 ${message eq "insert" ? "입력" : "수정"}</h1>
<form:form action="/myapp/emp/${message}" method="post" modelAttribute="emp" enctype="multipart/form-data">
<table border=1>
<tr>
<th>사원번호</th>
<td><form:input path="employeeId"/>
<form:errors path="employeeId"/><button id="check">중복 검사</button></td>
</tr>
<tr>
<th>이름</th>
<td><form:input path="firstName" />
<form:errors path="firstName"/></td>
</tr>
<tr>
<th>성</th>
<td><form:input path="lastName"/>
<form:errors path="lastName"/></td>
</tr>
<tr>
<th>이메일</th>
<td><form:input path="email"/>
<form:errors path="email"/></td>
</tr>
<tr>
<th>연락처</th>
<td><form:input path="phoneNumber"/>
<form:errors path="phoneNumber"/></td>
</tr>
<tr>
<th>입사일</th>
<td><form:input path="hireDate" type="date" required="required"/>
<form:errors path="hireDate"/></td>
</tr>
<tr>
<th>직무</th>
<td><form:select path="jobId">
<c:forEach var="job" items="${jobList}">
<option value="${job.jobId}">${job.jobTitle}</option>
</c:forEach>
</form:select></td>
</tr>
<tr>
<th>급여</th>
<td><form:input path="salary"/>
<form:errors path="salary"/></td>
</tr>
<tr>
<th>보너스율</th>
<td><form:input path="commissionPct" type="number" step="0.05"/>
<form:errors path="commissionPct"/></td>
</tr>
<tr>
<th>매니저</th>
<td><form:select path="managerId">
<c:forEach var="man" items="${manList}">
<option value="${man.managerId}">${man.managerName}</option>
</c:forEach>
</form:select></td>
</tr>
<tr>
<th>부서</th>
<td><form:select path="departmentId">
<c:forEach var="dept" items="${deptList}">
<option value="${dept.departmentId}">${dept.departmentName}</option>
</c:forEach>
</form:select>
</td>
</tr>
<tr>
<td>프로필 사진(5MB 이하)</td><td><input type=file name=file></td>
</tr>
<tr>
<th colspan=2><input type=submit value="저장" id=submit>
<input type=reset value="취소"></input></th>
</tr>
</table>
</form:form>
<script>
$(function(){
	var ck = false;
	$("#check").on("click",function(){
		if($("#employeeId").val()){
			$.ajax({
				url : "check",
				type : "post",
				data : {empId : $("#employeeId").val()},
				dataType : "text",
				success : function(check){
					console.log(check);
					if(check){
						alert("중복되지 않습니다.");
						$("#check").remove();
						$("#employeeId").attr("readonly",true);
						ck = !ck;
					}else{
						alert("사원번호가 중복됩니다.");
					}
					return false;
				},
				error : function(){
					alert("ajax에 문제가 있습니다.");
					return false;
				}
			});
		}else{
			alert("값이 있어야 합니다.");
			return false;
		}
	});
	$("#submit").on("click",function(){
	if(ck){
	
	}else{
		alert("중복검사가 먼저 진행되어야 합니다.");
		return false;
		}	
	});
});
</script>
</body>
</html>