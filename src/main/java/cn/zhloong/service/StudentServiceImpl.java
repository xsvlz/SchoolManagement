package cn.zhloong.service;

import cn.zhloong.mapper.ClassMapper;
import cn.zhloong.mapper.CourseMapper;
import cn.zhloong.mapper.GradeMapper;
import cn.zhloong.mapper.StudentMapper;
import cn.zhloong.pojo.Class;
import cn.zhloong.pojo.Course;
import cn.zhloong.pojo.Grade;
import cn.zhloong.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    @Autowired
    ClassMapper classMapper;
    @Autowired
    GradeMapper gradeMapper;
    @Autowired
    CourseMapper courseMapper;

    @Override
    public Student queryStudent(String sno) {
        return studentMapper.queryStudent(sno);
    }

    @Override
    public void modifyPassword(String sno, String password) {
        studentMapper.updateStudent(new Student(sno, "", "", null, "", password));
    }

    @Override
    public List<Grade> queryGrade(String sno) {
        return gradeMapper.queryGradeBySno(sno);
    }

    @Override
    public Class queryClass(String cno) {
        return classMapper.queryClass(cno);
    }

    @Override
    public List<Course> queryAllCourse() {
        return courseMapper.queryAllCourse();
    }

    @Override
    public void addCourse(String sno, String cono) {
        gradeMapper.addGrade(new Grade(sno, cono, null, null, null));
    }
}
