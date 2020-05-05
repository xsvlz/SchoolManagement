package cn.zhloong.service;

import cn.zhloong.mapper.*;
import cn.zhloong.pojo.*;
import cn.zhloong.pojo.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    ClassMapper classMapper;
    @Autowired
    GradeMapper gradeMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    public Teacher queryTeacher(String tno) {
        return teacherMapper.queryTeacher(tno);
    }

    @Override
    public void modifyPassword(String tno, String password) {
        teacherMapper.updateTeacher(new Teacher(tno, null, null, null, null, null, password));
    }

    @Override
    public List<Student> queryStudents(String tno) {
        List<Class> classes = classMapper.queryClassByTno(tno);
        List<Student> studentList = new ArrayList<>();
        for (Class clazz : classes) {
            List<Student> students = studentMapper.queryStudentByClass(clazz.getCno());
            studentList.addAll(students);
        }
        return studentList;
    }

    @Override
    public void modifyStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public List<Course> queryCourses(String tno) {
        return courseMapper.queryCourseByTno(tno);
    }

    @Override
    public List<Grade> queryGrades(String tno) {
        List<Course> courses = queryCourses(tno);
        List<Grade> gradeList = new ArrayList<>();
        for (Course cours : courses) {
            List<Grade> grades = gradeMapper.queryGradeByCono(cours.getCono());
            gradeList.addAll(grades);
        }
        return gradeList;
    }

    @Override
    public List<Grade> queryStudentGrades(String sno) {
        return gradeMapper.queryGradeBySno(sno);
    }

    @Override
    public void modifyGrade(Grade grade) {
        gradeMapper.updateGrade(grade);
    }

    @Override
    public List<Class> queryClass(String tno) {
        return classMapper.queryClassByTno(tno);
    }

    @Override
    public void addClass(String tno, String cno) {
        classMapper.updateClass(new Class(cno, null, null, tno, null));
    }
}
