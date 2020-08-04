package com.example.webdemo.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "psi")
@Component
@Data
public class PsiProperties {

    private String url;
}
