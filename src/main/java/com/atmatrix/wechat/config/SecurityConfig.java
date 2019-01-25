package com.atmatrix.wechat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ProjectName: wx-msg-persistence
 * @ClassName: SecurityConfig
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-14 2:23 PM
 **/

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(
                        HttpMethod.GET,
                        "/",
                        "/*.html",
                        "/favicon.ico",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/webjars/**",
                        "/swagger-resources/**",
                        "/*/api-docs"
                ).permitAll()
                .antMatchers("/actuator/**").authenticated()
                .anyRequest().permitAll();


    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers(HttpMethod.GET, "*.js")
                .antMatchers("/msg/**")
                .antMatchers("/druid/**")
                .antMatchers(HttpMethod.GET, ".html");

    }


}
