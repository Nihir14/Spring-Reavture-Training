package com.nihir.rev.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")   // default, optional
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean created");
    }
}
