package com.suyang.testserver.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "settings")
@RefreshScope
class ConfigTest(
        var name1: String = "",
        var name2: String = "",
        var name3: String = ""
)