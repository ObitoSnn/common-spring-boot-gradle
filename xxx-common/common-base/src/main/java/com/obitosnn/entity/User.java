package com.obitosnn.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ObitoSnn
 */
@Data
@ToString
@Component
@ConfigurationProperties("user")
public class User {
    private String serverUrl;
}
