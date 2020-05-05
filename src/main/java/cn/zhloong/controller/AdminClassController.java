package cn.zhloong.controller;

import cn.zhloong.pojo.Class;
import cn.zhloong.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminClassController {
    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @RequestMapping("/allClass")
    public String classList(Model model) {
        List<Class> classes = adminService.queryAllClass();
        model.addAttribute("classes", classes);
        return "admin/manageClass";
    }

    @RequestMapping("/toAddClass")
    public String toAddClass() {
        return "admin/addClass";
    }

    @PostMapping("/addClass")
    public String addClass(Class clazz) {
        adminService.addClass(clazz);
        return "redirect:/admin/allClass";
    }

    @RequestMapping("/toUpdateClass/{cno}")
    public String toUpdateClass(Model model, @PathVariable("cno") String cno) {
        model.addAttribute("cno", cno);
        return "admin/updateClass";
    }

    @PostMapping("/updateClass")
    public String updateClass(Class clazz) {
        adminService.modifyClass(clazz);
        return "redirect:/admin/allClass";
    }

    @RequestMapping("/delClass/{cno}")
    public String delClass(@PathVariable("cno") String cno) {
        adminService.deleteClass(cno);
        return "redirect:/admin/allClass";
    }


}
