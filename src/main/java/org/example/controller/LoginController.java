package org.example.controller;

import org.example.domain.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET )
    public String login(){
        return "login"; //login.jsp 로 연결
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST )
    public String my_page(HttpServletRequest httpServletRequest, User user, Model model){
        String id = httpServletRequest.getParameter("account"); // /login 페이지에서 ID 옆의 빈 칸 'account' 에 입력한 값을 저장
        String pw = httpServletRequest.getParameter("pw"); // /login 페이지에서 PW 옆의 빈 칸 'pw' 에 입력한 값을 저장
        System.out.print("id = "); //콘솔출력용
        System.out.println(id); //콘솔출력용
        System.out.print("pw = "); //콘솔출력용
        System.out.println(pw); //콘솔출력용
        model.addAttribute("name", user.getAccount());
        System.out.println(user.getAccount());
        System.out.println(user.getAddress());
        model.addAttribute("pw", user.getPw());

        return "mypage"; //mypage.jsp 로 연결
    }


}
