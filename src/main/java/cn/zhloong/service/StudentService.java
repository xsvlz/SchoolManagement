package cn.zhloong.service;

import cn.zhloong.pojo.Class;
import cn.zhloong.pojo.Course;
import cn.zhloong.pojo.Grade;
import cn.zhloong.pojo.Student;

import java.util.List;

public interface StudentService {

    // 查询当前学生的信息
    public Student queryStudent(String sno);

    // 修改密码
    public void modifyPassword(String sno, String password);

    // 查询该学生的选课成绩
    public List<Grade> queryGrade(String sno);

    // 查询班级信息
    public Class queryClass(String cno);

    // 查询所有课程
    public List<Course> queryAllCourse();

    // 添加选课信息
    public void addCourse(String sno, String cono);
}
