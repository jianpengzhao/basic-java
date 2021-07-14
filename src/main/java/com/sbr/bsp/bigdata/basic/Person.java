package com.sbr.bsp.bigdata.basic;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: Person
 * @Description:
 * @Author: ZhaoJianPeng
 * @Date: 2021-06-21 14:59
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 6311002372001934282L;
    private String id;
    private String username;
    private String nickName;
    private Integer password;
    private Integer idCard;
}
