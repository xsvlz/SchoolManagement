package cn.zhloong.mapper;

import cn.zhloong.pojo.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeMapper {
    List<Grade> queryAllGrade();

    Grade queryGrade(@Param("sno") String sno, @Param("cno") String cno);

    List<Grade> queryGradeBySno(@Param("sno") String sno);

    List<Grade> queryGradeByCono(@Param("cono") String cono);

    void addGrade(Grade grade);

    void updateGrade(Grade grade);

    void deleteGrade(@Param("sno") String sno, @Param("cno") String cno);
}
