package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    /**
     * create table GGRADE
     * (
     *    sno                  varchar(20) not null,
     *    cono                 varchar(20) not null,
     *    grade                varchar(20),
     *    primary key (sno, cono)
     * );
     */
    private String sno;
    private String cono;
    private String grade;
    private String sname;
    private String coname;
}
