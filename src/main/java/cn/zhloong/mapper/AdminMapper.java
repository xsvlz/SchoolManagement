package cn.zhloong.mapper;

import cn.zhloong.pojo.Administrate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    List<Administrate> queryAllAdmin();

    Administrate queryAdministrate(@Param("ano") String ano);
}
