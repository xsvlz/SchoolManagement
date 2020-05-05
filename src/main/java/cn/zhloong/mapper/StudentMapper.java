package cn.zhloong.mapper;

import cn.zhloong.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> queryAllStudent();

    Student queryStudent(@Param("sno") String sno);

    List<Student> queryStudentByClass(@Param("cno") String cno);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(@Param("sno") String sno);
}
