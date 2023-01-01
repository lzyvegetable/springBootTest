package com.itheima.domain;

import lombok.Data;

/**
 * @program: SpringBoot2
 * @description:
 * @author: lzy
 * @create: 2022-12-27 21:56
 **/

@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
