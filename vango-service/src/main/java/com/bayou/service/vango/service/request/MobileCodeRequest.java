package com.bayou.service.vango.service.request;

import com.bayou.service.vango.common.request.BaseRequest;
import lombok.Data;

@Data
public class MobileCodeRequest extends BaseRequest {

    private String mobile;

    private Integer verified;
}
