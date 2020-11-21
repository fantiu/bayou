package com.bayou.service.vango.service.request;

import com.bayou.service.vango.common.request.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserRequest extends BaseRequest {

    @NotNull
    private String mobile;

    private String ip;

}
