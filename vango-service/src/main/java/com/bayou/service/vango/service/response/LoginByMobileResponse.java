package com.bayou.service.vango.service.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginByMobileResponse {

    private Long uid;

    private String accessToken;
}
