package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    /**
     * create table CLASS
     * (
     *    cno                  varchar(20) not null,
     *    cname                varchar(20),
     *    number               int,
     *    department           varchar(20),
     *    mainteacher          varchar(20),
     *    primary key (cno)
     * );
     */
    private String cno;
    private String cname;
    private String department;
    private String mainteacher;
    private Integer number;
}
