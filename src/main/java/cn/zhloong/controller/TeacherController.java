package cn.zhloong.controller;

import cn.zhloong.pojo.Class;
import cn.zhloong.pojo.Course;
import cn.zhloong.pojo.Grade;
import cn.zhloong.pojo.Student;
import cn.zhloong.pojo.Teacher;
import cn.zhloong.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    @Qualifier("teacherServiceImpl")
    private TeacherService teacherService;

    @RequestMapping("/info/{tno}")
    public String info(Model model, @PathVariable("tno") String tno) {
        Teacher teacher = teacherService.queryTeacher(tno);
        model.addAttribute("teacher", teacher);
        return "teacher/information";
    }

    @RequestMapping("/toUpdatePassword/{tno}")
    public String toUpdatePassword(Model model, @PathVariable("tno") String tno) {
        model.addAttribute("tno", tno);
        return "teacher/updatePassword";
    }

    @PostMapping("/updatePassword")
    public String updatePassword(String tno, String tpass) {
        teacherService.modifyPassword(tno, tpass);
        return "redirect:/teacher/info/" + tno;
    }

    @RequestMapping("/students/{tno}")
    public String students(Model model, @PathVariable("tno") String tno) {
        List<Student> students = teacherService.queryStudents(tno);
        model.addAttribute("students", students);
        return "teacher/allStudent";
    }

    @RequestMapping("/toUpdateStudent/{sno}/{tno}")
    public String toUpdateStudent(Model model, @PathVariable("sno") String sno, @PathVariable("tno") String tno) {
        model.addAttribute("tno", tno);
        model.addAttribute("sno", sno);
        return "teacher/updateStudent";
    }

    @PostMapping("/updateStudent/{tno}")
    public String updateStudent(Student student, @PathVariable("tno") String tno) {
        teacherService.modifyStudent(student);
        return "redirect:/teacher/students/" + tno;
    }

    @RequestMapping("/toCourseManager/{sno}/{tno}")
    public String toCourseManager(Model model, @PathVariable("sno") String sno, @PathVariable("tno") String tno) {
        model.addAttribute("sno", sno);
        model.addAttribute("tno", tno);
        List<Grade> grades = teacherService.queryStudentGrades(sno);
        model.addAttribute("grades", grades);
        return "teacher/courseManager";
    }

    @RequestMapping("/toUpdateScore/{sno}/{cono}/{tno}")
    public String toUpdateScore(Model model, @PathVariable("sno") String sno, @PathVariable("cono") String cono, @PathVariable("tno") String tno) {
        model.addAttribute("sno", sno);
        model.addAttribute("cono", cono);
        model.addAttribute("tno", tno);
        return "teacher/updateScore";
    }

    @PostMapping("/updateScore/{tno}")
    public String updateScore(Grade grade, @PathVariable("tno") String tno) {
        teacherService.modifyGrade(grade);
        return "redirect:/teacher/students/" + tno;
    }

    @RequestMapping("/courses/{tno}")
    public String courses(Model model, @PathVariable("tno") String tno) {
        List<Course> courses = teacherService.queryCourses(tno);
        model.addAttribute("courses", courses);
        return "teacher/course";
    }

    @RequestMapping("/class/{tno}")
    public String classInfo(Model model, @PathVariable("tno") String tno) {
        List<Class> classes = teacherService.queryClass(tno);
        model.addAttribute("classes", classes);
        return "teacher/classes";
    }
}
