package com.atmatrix.wechat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ProjectName: wx-msg-persistence
 * @ClassName: SecurityConfig
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-14 2:23 PM
 **/

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and()
                .authorizeRequests().antMatchers("/actuator/**").authenticated()
                .anyRequest().permitAll();
    }

}
