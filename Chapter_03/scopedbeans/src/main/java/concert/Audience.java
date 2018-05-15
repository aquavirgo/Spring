package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Widzowie wyciszaja telefony");
            System.out.println("Widzowie zajmuja miejsca");
            jp.proceed();
        }catch (Throwable e){
            System.out.println("Oddaj hajs");
        }
    }
}
