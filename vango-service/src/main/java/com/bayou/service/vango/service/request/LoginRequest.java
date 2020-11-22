package com.bayou.service.vango.service.request;

import com.bayou.service.vango.common.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by root on 10/23/16.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginRequest extends BaseRequest {

    private Long appId;

    private String code;

    private Boolean isInternal;

    private String accessToken;

    private String redirectUri;

    private String mobile;

    private String ip;

    private String rawData;

    private String signature;

    private String encryptedData;

    private String iv;

    private Boolean hasAuth = true;
}
