package cn.zhloong.service;

import cn.zhloong.pojo.*;
import cn.zhloong.pojo.Class;

import java.util.List;

public interface TeacherService {

    // 查询教师个人信息
    Teacher queryTeacher(String tno);

    // 修改密码
    void modifyPassword(String tno, String password);

    // 查询老师带的所有学生
    List<Student> queryStudents(String tno);

    // 修改学生姓名
    void modifyStudent(Student student);

    // 查询老师教的所有课程
    List<Course> queryCourses(String tno);

    // 查询所有学生成绩
    List<Grade> queryGrades(String tno);

    // 查询学生成绩
    List<Grade> queryStudentGrades(String sno);

    // 修改学生成绩
    void modifyGrade(Grade grade);

    // 查看班级
    List<Class> queryClass(String tno);

    // 录入班级
    void addClass(String tno, String cno);

}
