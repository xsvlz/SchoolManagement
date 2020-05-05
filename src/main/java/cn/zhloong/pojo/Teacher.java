package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
     * create table TEACHER
     * (
     *    tno                  varchar(20) not null,
     *    tname                varchar(20),
     *    tsex                 char(5),
     *    tbackground          varchar(20),
     *    tprofession          varchar(20),
     *    department           varchar(20),
     *    tpass                varchar(20),
     *    primary key (tno)
     * );
     */
    private String tno;
    private String tname;
    private String tsex;
    private String tbackground;
    private String tprofession;
    private String department;
    private String tpass;
}
