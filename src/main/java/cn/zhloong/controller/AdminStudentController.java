package cn.zhloong.controller;

import cn.zhloong.pojo.Grade;
import cn.zhloong.pojo.Student;
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
public class AdminStudentController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @RequestMapping("/allStudent")
    public String studentList(Model model) {
        List<Student> students = adminService.queryAllStudent();
        model.addAttribute("students", students);
        return "admin/manageStudent";
    }

    @RequestMapping("/toAddStudent")
    public String toAddStudent() {
        return "admin/addStudent";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        adminService.addStudent(student);
        return "redirect:/admin/allStudent";
    }

    @RequestMapping("/toUpdateStudent/{sno}")
    public String toUpdateStudent(Model model, @PathVariable("sno") String sno) {
        model.addAttribute("sno", sno);
        return "admin/updateStudent";
    }

    @PostMapping("/updateStudent")
    public String updateStudent(Student student) {
        adminService.modifyStudent(student);
        return "redirect:/admin/allStudent";
    }

    @RequestMapping("/delStudent/{sno}")
    public String del(@PathVariable("sno") String sno) {
        adminService.deleteStudent(sno);
        return "redirect:/admin/allStudent";
    }

    @RequestMapping("/toCourseManager/{sno}")
    public String toCourseManager(Model model, @PathVariable("sno") String sno) {
        model.addAttribute("sno", sno);
        List<Grade> grades = adminService.querySC(sno);
        model.addAttribute("grades", grades);
        return "admin/courseManager";
    }

    @RequestMapping("/toUpdateScore/{sno}/{cono}")
    public String toUpdateScore(Model model, @PathVariable("sno") String sno, @PathVariable("cono") String cono) {
        model.addAttribute("sno", sno);
        model.addAttribute("cono", cono);
        return "admin/updateScore";
    }

    @PostMapping("/updateScore")
    public String updateScore(Grade grade) {
        adminService.modifyGrade(grade);
        return "redirect:/admin/allStudent";
    }

    @RequestMapping("/delScore/{sno}/{cono}")
    public String deleteScore(@PathVariable("sno") String sno, @PathVariable("cono") String cono) {
        adminService.deleteGrade(sno, cono);
        return "redirect:/admin/allStudent";
    }

    @RequestMapping("/toAddGrade/{sno}")
    public String toAddGrade(Model model, @PathVariable("sno") String sno) {
        model.addAttribute("sno", sno);
        return "admin/addGrade";
    }

    @PostMapping("/addGrade")
    public String addGrade(Grade grade) {
        adminService.addSC(grade);
        return "redirect:/admin/allStudent";
    }
}
