package com.atmatrix.wechat.common.log;

import com.atmatrix.wechat.common.annotation.CustomerLog;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.concurrent.*;

@Slf4j
@Aspect
@Component
public class CustomerAspectLog {

    private Gson gson = new Gson();

    /**
     * 保存日志到数据库的线程池
     */

    ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("CustomerAspectLog-Thread-%d").build();

    ThreadLocal<Long> startTime = new ThreadLocal<Long>();



    @Pointcut("@annotation(com.atmatrix.wechat.common.annotation.CustomerLog)")
    public void customerLog() {

    }


    @Around("customerLog()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        startTime.set(System.currentTimeMillis());
        long beginTime = System.currentTimeMillis();
        // 执行方法返回结果
        Object result = point.proceed();
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        // 获取request
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 获取请求的ip
        String ip = request.getRemoteAddr();
        String requestMethod = request.getMethod();
        String requestURI = request.getRequestURI();
        String requestURL = request.getRequestURL().toString();

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        //保存日志到数据库
        CustomerLog customerLog = method.getAnnotation(CustomerLog.class);
        // 请求的方法名
        String className = point.getTarget().getClass().getName();
        String methodName = signature.getName();

        // 请求的参数
        Object[] args = point.getArgs();
        String params = gson.toJson(args[0]);
        log.info(MessageFormat.format("CustomerAspect Request: Method: [{0}]", requestMethod));
        log.info(MessageFormat.format("CustomerAspect Request: URI: [{0}]", requestURI));
        log.info(MessageFormat.format("CustomerAspect Request: URL: [{0}]", requestURL));
        log.info(MessageFormat.format("CustomerAspect Request: Params: [{0}]", params));
        log.info(MessageFormat.format("CustomerAspect Request: IP: [{0}]", ip));
        log.info(MessageFormat.format("CustomerAspect Request: Execute Time: [{0}]", time));
        log.info(MessageFormat.format("CustomerAspect Class Method Names: [{0}.{1}]", className, methodName));
        log.info(MessageFormat.format("CustomerAspect Class Method Params: [{0}]", params));
        log.info(MessageFormat.format("CustomerAspect Class Method Description: [{0}]", customerLog.value()));
        return result;
    }

    @AfterReturning(returning = "object", pointcut = "customerLog()")
    public void doAfterReturning(Object object) {
        // 处理完请求，返回内容
        log.info(MessageFormat.format("CustomerAspect Response Data: [{0}]", gson.toJson(object)));
        log.info(MessageFormat.format("CustomerAspect Response Execute Time: [{0}]" ,(System.currentTimeMillis() - startTime.get())));
    }


}
