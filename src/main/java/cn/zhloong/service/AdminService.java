package cn.zhloong.service;

import cn.zhloong.pojo.Class;
import cn.zhloong.pojo.Course;
import cn.zhloong.pojo.Grade;
import cn.zhloong.pojo.Student;
import cn.zhloong.pojo.Teacher;

import java.util.List;

public interface AdminService {
    // 添加学生信息
    void addStudent(Student student);

    // 修改学生信息
    void modifyStudent(Student student);

    // 删除学生信息
    void deleteStudent(String sno);

    // 添加选课信息
    void addSC(Grade grade);

    // 查询学生选课信息
    List<Grade> querySC(String sno);

    // 查询所有课程信息
    List<Course> queryAllCourse();

    // 添加课程信息
    void addCourse(Course course);

    // 修改课程信息
    void modifyCourse(Course course);

    // 删除课程信息
    void deleteCourse(String cono);

    // 修改学生成绩
    void modifyGrade(Grade grade);

    // 删除学生成绩
    void deleteGrade(String sno, String cono);

    // 添加教师
    void addTeacher(Teacher teacher);

    // 修改教师
    void modifyTeacher(Teacher teacher);

    // 删除教师
    void deleteTeacher(String tno);

    // 添加班级
    void addClass(Class clazz);

    // 班级管理
    void modifyClass(Class clazz);

    // 删除班级
    void deleteClass(String cno);

    // 查询所有教师
    List<Teacher> queryAllTeacher();

    // 查询所有学生
    List<Student> queryAllStudent();

    // 查询所有班级
    List<Class> queryAllClass();

}
