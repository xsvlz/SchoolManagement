package cn.zhloong.controller;

import cn.zhloong.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("loginServiceImpl")
    private LoginService loginService;

    @PostMapping("/login")
    public String login(Model model, String username, String password, String identity) {
        boolean isCorrect = false;
        if ("admin".equals(identity) && loginService.checkAdmin(username, password)) {
            model.addAttribute("username", username);
            return "admin";
        } else if ("student".equals(identity) && loginService.checkStudent(username, password)) {
            model.addAttribute("sno", username);
            return "student";
        } else if ("teacher".equals(identity) && loginService.checkTeacher(username, password)) {
            model.addAttribute("tno", username);
            return "teacher";
        }

        return "errorPage";
    }
}
