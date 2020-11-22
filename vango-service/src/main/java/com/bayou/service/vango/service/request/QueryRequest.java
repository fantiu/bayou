package com.bayou.service.vango.service.request;

import com.bayou.service.vango.common.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = false)
public class QueryRequest extends BaseRequest {

    @NotNull
    private String token;

    private String ip;

    private String uri;
}
