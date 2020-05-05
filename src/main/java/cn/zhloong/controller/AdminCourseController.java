package cn.zhloong.controller;

import cn.zhloong.pojo.Course;
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
public class AdminCourseController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @RequestMapping("/allCourse")
    public String courseList(Model model) {
        List<Course> courses = adminService.queryAllCourse();
        model.addAttribute("courses", courses);
        return "admin/manageCourse";
    }

    @RequestMapping("/toAddCourse")
    public String toAddCourse() {
        return "admin/addCourse";
    }

    @PostMapping("/addCourse")
    public String addCourse(Course course) {
        adminService.addCourse(course);
        return "redirect:/admin/allCourse";
    }

    @RequestMapping("/toUpdateCourse/{cono}")
    public String toUpdateCourse(Model model, @PathVariable("cono") String cono) {
        model.addAttribute("cono", cono);
        return "admin/updateCourse";
    }

    @PostMapping("/updateCourse")
    public String updateCourse(Course course) {
        adminService.modifyCourse(course);
        return "redirect:/admin/allCourse";
    }

    @RequestMapping("/delCourse/{cono}")
    public String deleteCourse(@PathVariable("cono") String cono) {
        adminService.deleteCourse(cono);
        return "redirect:/admin/allCourse";
    }
}
