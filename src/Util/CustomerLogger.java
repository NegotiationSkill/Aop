package Util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 刘棋军
 * @date2019-02-21
 */
@Component("logger")
@Aspect
public class CustomerLogger {

    //切入点配置
    @Pointcut("execution(* com.liuqijun.spring.CustomerServerImp.update(..))")
   private void pt1(){}

   @Before(value = "execution(* com.liuqijun.spring.CustomerServerImp.update(..))")
    public void beforAdvice(){
        System.out.println("前置通知！");
    }

    @AfterReturning(value = "execution(* com.liuqijun.spring.CustomerServerImp.update(..))")
    public void afterReturn(){
        System.out.println("后置通知");
    }

    @After(value = "execution(* com.liuqijun.spring.CustomerServerImp.update(..))")
    public void after(){
        System.out.println("最终通知");
    }

    @AfterThrowing(value = "execution(* com.liuqijun.spring.CustomerServerImp.update(..))")
    public void throwing(){
        System.out.println("异常通知通知");
    }

    /**
     * spring提供了ProceedingJoinPoint接口：用来做为环绕通知的形参
     * ProceedinngJoinPoint有个proceed方法就相当method.invoke()
     * 环绕通知可以通过手写代码的位置来指定通知类型，之前是在xml文件中配置，在环绕通知中通知与调用切入点的相对位置确定了它的类型
     */
    //@Around(value = "execution(* com.liuqijun.spring.CustomerServerImp.*(..))")
    public Object around(ProceedingJoinPoint pjp){
        System.out.println("环绕通知");
        Object retValue = null;
        //调用切入点
        try {
            System.out.println("huanrao  前置通知");
            retValue= pjp.proceed();
            System.out.println("huanrao  后置通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally{
            System.out.println("huanrao  最终通知");
        }
        return retValue;
    }
}
