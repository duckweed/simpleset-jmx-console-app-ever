package org.adscale;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(description = "jmxBean", persistPolicy = "never", objectName = "jmxDemo:type=jmxDemoT")
public class App {

    @ManagedOperation
    public void ping() {
        System.out.println("pong");
    }

}
