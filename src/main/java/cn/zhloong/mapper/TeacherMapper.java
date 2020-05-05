package cn.zhloong.mapper;

import cn.zhloong.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> queryAllTeacher();

    Teacher queryTeacher(@Param("tno") String tno);

    void addTeacher(Teacher teacher);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(@Param("tno") String tno);
}
