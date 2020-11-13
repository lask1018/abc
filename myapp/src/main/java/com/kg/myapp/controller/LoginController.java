package com.kg.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.kg.myapp.dao.IMemberService;
import com.kg.myapp.vo.MemberVO;

@Controller
public class LoginController {
	
	@Autowired
	IMemberService memberService;
	
	@Autowired
	BCryptPasswordEncoder bpe;
	
	@PostMapping(value="/login.do")
	public String login(String id, String pw, Model model, HttpSession session) {
		String dbpw = memberService.getPassword(id);
		if(dbpw != null & bpe.matches(pw, dbpw)) {
			MemberVO member = memberService.getMember(id);
			session.setAttribute("member", member);
			session.setAttribute("userId", id);
			return "redirect:/emp";
		}else {
			model.addAttribute("message", "아이디 또는 비밀번호가 잘못되었습니다.");
			return "/login";
		}
	}
	
	@PostMapping(value="/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}

}
