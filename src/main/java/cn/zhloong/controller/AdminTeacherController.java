package cn.zhloong.controller;

import cn.zhloong.pojo.Teacher;
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
public class AdminTeacherController {
    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @RequestMapping("/allTeacher")
    public String classList(Model model) {
        List<Teacher> teachers = adminService.queryAllTeacher();
        model.addAttribute("teachers", teachers);
        return "admin/manageTeacher";
    }

    @RequestMapping("/toAddTeacher")
    public String toAddClass() {
        return "admin/addTeacher";
    }

    @PostMapping("/addTeacher")
    public String addClass(Teacher teacher) {
        adminService.addTeacher(teacher);
        return "redirect:/admin/allTeacher";
    }

    @RequestMapping("/toUpdateTeacher/{tno}")
    public String toUpdateClass(Model model, @PathVariable("tno") String tno) {
        model.addAttribute("tno", tno);
        return "admin/updateTeacher";
    }

    @PostMapping("/updateTeacher")
    public String updateTeacher(Teacher teacher) {
        adminService.modifyTeacher(teacher);
        return "redirect:/admin/allTeacher";
    }

    @RequestMapping("/delTeacher/{tno}")
    public String delTeacher(@PathVariable("tno") String tno) {
        adminService.deleteTeacher(tno);
        return "redirect:/admin/allTeacher";
    }

}
