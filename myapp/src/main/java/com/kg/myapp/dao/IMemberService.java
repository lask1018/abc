package com.kg.myapp.dao;

import com.kg.myapp.vo.MemberVO;

public interface IMemberService {
	
	void insertMember(MemberVO user);
	String getPassword(String userid);
	MemberVO getMember(String userid);
	int idCheck(String userid);

}
