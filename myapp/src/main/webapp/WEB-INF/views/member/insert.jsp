<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
#loadingImage{
position : absolute;
left : 50%;
top : 50%;
background : #ffffff;
}
</style>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>회원 가입</title>
</head>
<body>
<h1>회원 정보 등록</h1>
<form action="/myapp/member/insert" method=post enctype="multipart/form-data">
<table>
<tr>
<td>아이디<input type=text name=userId id=userId><button type=button id=check>중복검사</button></td>
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
<td><input type=submit value="저장" id=submit><input type=reset value="취소"></td>
</tr>
</table>
<div id="loadingImage"><img src="/myapp/resources/images/loading.gif" />/</div>
</form>
<script>
$(function(){
	$("#loadingImage").hide();
	var ck = false;
	$("#check").on("click",function(){
		if($("#userId").val()){
		$.ajax({
			url : "/myapp/member/check",
			type : "post",
			data : {userid : $("#userId").val()},
			dataType : "text",
			success : function(result){
				if(result){
					alert("사용 가능한 아이디입니다.");
					$("#check").remove();
					$("#userId").attr("readonly",true);
					ck = !ck;
				}else{
					alert("아이디가 중복됩니다.");	
				}
				return false;
				},
				error : function(){
					alert("ajax 실패");
					return false;
				}
			});
		}else{
		alert("id가 입력되어야 중복검사가 가능합니다.");
		return false;
			}
	});
	$(document).ajaxStart(function(){
		$("#loadingImage").show();
		setTimeout(function(){},2000);
	});
	$(document).ajaxStop(function(){
		$("#loadingImage").hide();
	});
	$("#submit").on("click",function(){
		if(!ck){
			alert("중복검사를 진행하셔야 합니다.");
			return false;
		}else{
			
		}
	});
});
</script>
</body>
</html>