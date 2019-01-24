//package com.atmatrix.wechat.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by zhangsunny0808@gmail.com  2018/01/08
// * Description:
// */
//@Configuration
//@ServletComponentScan // 用于扫描所有的Servlet、filter、listener
//public class DruidConfig {
//
//
//    @Bean
//    public ServletRegistrationBean druidServlet() {
//        ServletRegistrationBean reg = new ServletRegistrationBean();
//        reg.setServlet(new StatViewServlet());
//        reg.addUrlMappings("/druid/*");
//        //设置控制台管理用户
//        reg.addInitParameter("loginUsername","root");
//        reg.addInitParameter("loginPassword","root");
//        // 禁用HTML页面上的“Reset All”功能
//        reg.addInitParameter("resetEnable","false");
//        reg.addInitParameter("allow", "127.0.0.1"); //白名单
//        return reg;
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        //创建过滤器
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        Map<String, String> initParams = new HashMap<String, String>();
//        //忽略过滤的形式
//        initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
//        filterRegistrationBean.setInitParameters(initParams);
//        //设置过滤器过滤路径
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//}
