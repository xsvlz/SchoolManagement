package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
     * create table STUDENT
     * (
     *    sno                  varchar(20) not null,
     *    sname                varchar(20),
     *    ssex                 char(5),
     *    sage                 int,
     *    cno                  varchar(20),
     *    spass                varchar(20),
     *    primary key (sno)
     * );
     */
    private String sno;
    private String sname;
    private String ssex;
    private Integer sage;
    private String cno;
    private String spass;
}
