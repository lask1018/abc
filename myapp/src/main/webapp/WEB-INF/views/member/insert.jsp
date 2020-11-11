<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
<h1>회원 정보 등록</h1>
<form action="/myapp/member/insert" method=post enctype="multipart/form-data">
<table>
<tr>
<td>아이디<input type=text name=userId></td>
</tr>
<tr>
<td>비밀번호<input type=text name=password></td>
</tr>
<tr>
<td>이름<input type=text name=name></td>
</tr>
<tr>
<td>휴대폰 번호<input type=text name=tel></td>
</tr>
<tr>
<td>프로필 사진<input type=file name=file></td>
</tr>
<tr>
<td><input type=submit value="저장"><input type=reset value="취소"></td>
</tr>
</table>
</form>
<script>
$(function(){
	var ck = false;
	$("#check").on("click",function(){
		if($("#userId").val()){
			$.ajax({
				url : "check",
				type : "post",
				data : {empId : $("#userId").val()},
				dataType : "text",
				success : function(check){
					console.log(check);
					if(check){
						alert("중복되지 않습니다.");
						$("#check").remove();
						$("#userId").attr("readonly",true);
						ck = !ck;
					}else{
						alert("아이디가 중복됩니다.");
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