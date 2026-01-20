package com.nihir.rev.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("websocket")
public class WebSocketBean {

    public WebSocketBean() {
        System.out.println("WebSocketBean created");
    }

    public String getMessage() {
        return "Hello from WebSocket scope";
    }
}
