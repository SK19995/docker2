/*
 * © Copyright Process Asset Integration and Management Limited 2013 - 2019.
 *  All rights reserved.
 */

package com.example.demo.config;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * @project: proaim-trinity-demo
 * @packageName: com.proaimltd.web.pub.config
 * @author: liu10
 * @date: 2019/6/18 11:05
 * @description：环境参数配置类
 */
@Configuration(value = "appConfigBean")
@PropertySource("classpath:env/${spring.profiles.active}.properties")
@Getter
@ToString
public class AppConfigBean {
	@Value("${debug}")
	private boolean isDebugEnabled;
    //-------------------- jdbc datasource1 config read --------------------
    @Value("${jdbc.transaction.timeout}")
    private int transactionTimeout;
	@Value("${jdbc.connectionTimeout}")
	private Long jdbcConnectionTimeout;
    @Value("${jdbc.datasource.url}")
    private String jdbcUrl;
    @Value("${jdbc.datasource.driverClassName}")
    private String jdbcDriverClassname;
    @Value("${jdbc.datasource.username}")
    private String jdbcUsername;
    @Value("${jdbc.datasource.password}")
    private String jdbcPassword;
    @Value("${jdbc.testConnection.query}")
    private String jdbcConnectionTestQuery;
    @Value("${jdbc.connectionTimeout}")
    private Integer connectionTimeout;
    @Value("${jdbc.clientIdleTimeout}")
    private Long jdbcIdleTimeout;
    @Value("${jdbc.maxLifetime}")
    private Long jdbcMaxLifetime;
    @Value("${jdbc.maxPoolSize}")
    private Integer jdbcMaxPoolSize;
}
