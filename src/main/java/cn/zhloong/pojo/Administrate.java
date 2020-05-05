package cn.zhloong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrate {
    /**
     * create table administrate
     * (
     *    ano                  varchar(20) not null,
     *    apass                varchar(20),
     *    primary key (ano)
     * );
     */
    private String ano;
    private String apass;
}
