package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeToCou {
    /**
     * Teacher to Course
     * create table TE_TO_COU
     * (
     *    cono                 varchar(20) not null,
     *    tno                  varchar(20) not null,
     *    primary key (cono, tno)
     * );
     */
    private String cono;
    private String tno;
}
