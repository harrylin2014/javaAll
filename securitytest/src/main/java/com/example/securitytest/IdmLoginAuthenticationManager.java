package com.example.securitytest;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class IdmLoginAuthenticationManager implements AuthenticationManager {
    @Resource
    private IdmLoginAuthenticationProvider idmLoginAuthenticationProvider;

    public IdmLoginAuthenticationManager(IdmLoginAuthenticationProvider idmLoginAuthenticationProvider){
        this.idmLoginAuthenticationProvider=idmLoginAuthenticationProvider;
    }

    @Override
    public Authentication authenticate(Authentication authentication) {
        Authentication result = idmLoginAuthenticationProvider.authenticate(authentication);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new ProviderNotFoundException("Authentication failed!");
    }
}
