package cn.zhloong.mapper;

import cn.zhloong.pojo.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {
    List<Class> queryAllClass();

    List<Class> queryClassByTno(@Param("tno")String tno);

    Class queryClass(String cno);

    void addClass(Class clazz);

    void updateClass(Class clazz);

    void deleteClass(String cno);

}
