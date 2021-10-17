package com.lichongbing.lstudyhttp.watergas.config;

import com.lichongbing.lstudyhttp.watergas.constant.WatergasProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/17 9:56 上午
 * @description: TODO
 */
@Configuration
@EnableConfigurationProperties(WatergasProperties.class)
public class WatergasConfiguration {
    private final WatergasProperties watergasProperties;

    public WatergasConfiguration(WatergasProperties watergasProperties) {
        this.watergasProperties = watergasProperties;
    }

    public WatergasProperties getWatergasProperties() {
        return watergasProperties;
    }
}
