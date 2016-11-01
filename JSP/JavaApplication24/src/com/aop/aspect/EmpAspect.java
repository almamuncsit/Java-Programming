
package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmpAspect {
    
    @Before("execution (public String getName())")
    public void beforeAspect() {
        System.out.println("Aspect run");
    }
    
}
