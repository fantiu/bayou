package com.bayou.service.vango.data.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements  Serializable {

    public static Integer GENDER_MAN = 1;
    public static Integer GENDER_WOMAN = 2;

    private Long id;

    private Long uid;

    private String mobile;

    private String nickname;

    private Integer gender;

    private String avatar;

    private String createdIp;

    private Long createdAt;

    private Long updatedAt;

    private static final long serialVersionUID = 1L;
}