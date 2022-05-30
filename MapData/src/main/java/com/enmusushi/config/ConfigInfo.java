package com.enmusushi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 */

@Component
@Data
@ConfigurationProperties(
        prefix = "config"
)
public class ConfigInfo {
    private String dataUrl;
    private String filePath;
}
