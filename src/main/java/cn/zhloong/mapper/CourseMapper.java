package cn.zhloong.mapper;

import cn.zhloong.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
    List<Course> queryAllCourse();

    Course queryCourse(@Param("cono") String cono);

    List<Course> queryCourseByTno(@Param("tno") String tno);

    void addCourse(Course course);

    void updateCourse(Course course);

    void deleteCourse(@Param("cono") String cono);
}
