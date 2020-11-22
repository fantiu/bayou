package com.bayou.service.vango.service.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Getter
@Setter
public class TokenConfig {

    private Integer tokenRedisTtl;

    @PostConstruct
    public void init() {
        tokenRedisTtl = 86400;
    }

}
