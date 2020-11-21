package com.bayou.service.vango.service.vo;


import com.bayou.service.vango.data.model.Users;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginObjHolder implements Serializable{

    private Users users;

    private Long uid;
}
