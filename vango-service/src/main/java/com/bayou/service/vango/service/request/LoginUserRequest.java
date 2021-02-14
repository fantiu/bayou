package com.bayou.service.vango.service.request;

import com.bayou.service.vango.common.request.BaseRequest;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserRequest extends BaseRequest {

    @NotNull
    private String mobile;

    private String ip;

}
