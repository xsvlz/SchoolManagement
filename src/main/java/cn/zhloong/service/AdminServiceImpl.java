package cn.zhloong.service;

import cn.zhloong.mapper.*;
import cn.zhloong.pojo.Class;
import cn.zhloong.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
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
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    @Override
    public void modifyStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public void deleteStudent(String sno) {
        studentMapper.deleteStudent(sno);
    }

    @Override
    public void addSC(Grade grade) {
        gradeMapper.addGrade(grade);
    }

    @Override
    public List<Grade> querySC(String sno) {
        return gradeMapper.queryGradeBySno(sno);
    }

    @Override
    public List<Course> queryAllCourse() {
        return courseMapper.queryAllCourse();
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.addCourse(course);
    }

    @Override
    public void modifyCourse(Course course) {
        courseMapper.updateCourse(course);
    }

    @Override
    public void deleteCourse(String cono) {
        courseMapper.deleteCourse(cono);
    }

    @Override
    public void modifyGrade(Grade grade) {
        gradeMapper.updateGrade(grade);
    }

    @Override
    public void deleteGrade(String sno, String cono) {
        gradeMapper.deleteGrade(sno, cono);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }

    @Override
    public void modifyTeacher(Teacher teacher) {
        teacherMapper.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(String tno) {
        teacherMapper.deleteTeacher(tno);
    }

    @Override
    public void addClass(Class clazz) {
        classMapper.addClass(clazz);
    }

    @Override
    public void modifyClass(Class clazz) {
        classMapper.updateClass(clazz);
    }

    @Override
    public void deleteClass(String cno) {
        classMapper.deleteClass(cno);
    }

    @Override
    public List<Teacher> queryAllTeacher() {
        return teacherMapper.queryAllTeacher();
    }

    @Override
    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    @Override
    public List<Class> queryAllClass() {
        return classMapper.queryAllClass();
    }
}
