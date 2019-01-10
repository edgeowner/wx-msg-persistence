//package com.atmatrix.wechat.common.log;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//import java.util.HashMap;
//import java.util.Map;
//
//@Slf4j
//@Aspect
//@Component
//public class WebLogAspect {
//
//
//    ThreadLocal<Long> startTime = new ThreadLocal<>();// 开始时间
//    // map存放方法被调用的次数O
//    ThreadLocal<Map<String, Long>> countMap = new ThreadLocal<>();
//    // map2存放方法总耗时
//    ThreadLocal<Map<String, Long>> timeMap = new ThreadLocal<>();
//
//
//    static final String pCutStr = "execution(* com.atmatrix.*..*(..))";
//
//    @Pointcut(value = pCutStr)
//    public void webLog() {
//
//    }
//
//    @Around("webLog()")
//    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
//        if (countMap.get() == null) {
//            countMap.set(new HashMap<>());
//        }
//        if (timeMap.get() == null) {
//            timeMap.set(new HashMap<>());
//        }
//        long start = System.currentTimeMillis();
//        try {
//            Object result = joinPoint.proceed();
//            if (result == null) {
//                return null;
//            }
//            long end = System.currentTimeMillis();
//            String tragetClassName = joinPoint.getSignature().getDeclaringTypeName();
//            String methodName = joinPoint.getSignature().getName();
//            Object[] args = joinPoint.getArgs();// 参数
//            int argsSize = args.length;
//            String argsTypes = "";
//            String typeStr = joinPoint.getSignature().getDeclaringType().toString().split(" ")[0];
//            String returnType = joinPoint.getSignature().toString().split(" ")[0];
//            log.info("ClassName:" + tragetClassName + "(" + typeStr + ")");
//            log.info("MethodName:" + methodName);
//            log.info("Args:" + args.toString());
//            log.info("Return type:" + returnType);
//            if (argsSize > 0) {
//                // 拿到参数的类型
//                for (Object object : args) {
//                    argsTypes += object.getClass().getTypeName().toString() + " ";
//                }
//                log.info("params type：" + argsTypes);
//            }
//
//            Long total = end - start;
//            log.info("Consuming Time: " + total + " ms!");
//
//            if (countMap.get().containsKey(methodName)) {
//                Long count = countMap.get().get(methodName);
//                countMap.get().remove(methodName);//先移除，在增加
//                countMap.get().put(methodName, count + 1);
//
//                count = timeMap.get().get(methodName);
//                timeMap.get().remove(methodName);
//                timeMap.get().put(methodName, count + total);
//            } else {
//                countMap.get().put(methodName, 1L);
//                timeMap.get().put(methodName, total);
//            }
//
//            return result;
//
//
//        } catch (Throwable e) {
//            long end = System.currentTimeMillis();
//            log.info("" + joinPoint + "\tUse time : " + (end - start) + " ms with exception : "
//                    + e.getMessage());
//            throw e;
//
//        }
//    }
//
//    //对Controller下面的方法执行前进行切入，初始化开始时间
//    @Before(value = "execution(* com.atmatrix.wechat.controller.*.*(..))")
//    public void beforMehhod(JoinPoint jp) {
//        startTime.set(System.currentTimeMillis());
//    }
//
//    //对Controller下面的方法执行后进行切入，统计方法执行的次数和耗时情况
//    //注意，这里的执行方法统计的数据不止包含Controller下面的方法，也包括环绕切入的所有方法的统计信息
//    @AfterReturning(value = "execution(* com.atmatrix.wechat.controller.*.*(..))")
//    public void afterMehhod(JoinPoint jp) {
//        long end = System.currentTimeMillis();
//        long total =  end - startTime.get();
//        String methodName = jp.getSignature().getName();
//        log.info("Join point method name：" + methodName + ",execute time：" +total+"ms");
//        //重新new一个map
//        Map<String, Long> map = new HashMap<>();
//        //从map2中将最后的 连接点方法给移除了，替换成最终的，避免连接点方法多次进行叠加计算
//        //由于map2受ThreadLocal的保护，这里不支持remove，因此，需要单开一个map进行数据交接
//        for(Map.Entry<String, Long> entry:timeMap.get().entrySet()){
//            if(entry.getKey().equals(methodName)){
//                map.put(methodName, total);
//
//            }else{
//                map.put(entry.getKey(), entry.getValue());
//            }
//        }
//        for (Map.Entry<String, Long> entry :countMap.get().entrySet()) {
//            for(Map.Entry<String, Long> entry2 :map.entrySet()){
//                if(entry.getKey().equals(entry2.getKey())){
//                    System.err.println(entry.getKey()+",Be Called Times："+entry.getValue()+",All Spend Time："+entry2.getValue()+"ms");
//                }
//            }
//
//        }
//    }
//
//
//}
