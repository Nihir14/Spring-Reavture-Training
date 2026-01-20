package com.nihir.rev.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class RequestBean {
    public RequestBean() {
        System.out.println("RequestBean created");
    }
}
