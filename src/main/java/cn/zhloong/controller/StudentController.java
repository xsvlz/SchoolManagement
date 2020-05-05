package cn.zhloong.controller;

import cn.zhloong.pojo.Class;
import cn.zhloong.pojo.Course;
import cn.zhloong.pojo.Grade;
import cn.zhloong.pojo.Student;
import cn.zhloong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/info/{sno}")
    public String info(Model model, @PathVariable("sno") String sno) {
        Student student = studentService.queryStudent(sno);
        model.addAttribute("student", student);
        return "student/information";
    }

    @RequestMapping("/toUpdatePassword/{sno}")
    public String toUpdatePassword(Model model, @PathVariable("sno") String sno) {
        model.addAttribute("sno", sno);
        return "student/updatePassword";
    }

    @RequestMapping("/updatePassword")
    public String updatePassword(String sno, String spass) {
        studentService.modifyPassword(sno, spass);
        return "redirect:/student/info/" + sno;
    }

    @RequestMapping("/courses/{sno}")
    public String courses(Model model, @PathVariable("sno") String sno) {
        List<Grade> grades = studentService.queryGrade(sno);
        model.addAttribute("grades", grades);
        return "student/grades";
    }

    @RequestMapping("/allCourse")
    public String allCourse(Model model) {
        List<Course> courses = studentService.queryAllCourse();
        model.addAttribute("courses", courses);
        return "student/allCourse";
    }

    @RequestMapping("/toAddGrade/{sno}")
    public String toAddGrade(Model model, @PathVariable("sno") String sno) {
        model.addAttribute("sno", sno);
        return "student/addGrade";
    }

    @PostMapping("/addGrade")
    public String addGrade(String sno, String cono) {
        studentService.addCourse(sno, cono);
        return "redirect:/student/courses/" + sno;
    }

    @RequestMapping("/class/{sno}")
    public String classInfo(Model model, @PathVariable("sno") String sno) {
        Student student = studentService.queryStudent(sno);
        Class clazz = studentService.queryClass(student.getCno());
        model.addAttribute("sno", sno);
        model.addAttribute("clazz", clazz);
        return "student/class";
    }
}
