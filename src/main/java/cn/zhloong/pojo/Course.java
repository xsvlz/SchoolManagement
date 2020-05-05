package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    /**
     * create table COURSE
     * (
     *    cono                 varchar(20) not null,
     *    coname               varchar(20),
     *    tno                  varchar(20),
     *    primary key (cono)
     * );
     */
    private String cono;
    private String coname;
    private String tno;
}
