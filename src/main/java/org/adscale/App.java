package org.adscale;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@ManagedResource(description = "jmxBean", persistPolicy = "never", objectName = "jmxDemo:type=jmxDemoT")
public class App {

    @ManagedOperation
    public void ping() {
        System.out.println("pong");
    }


    @ManagedOperation
    @ManagedOperationParameters(@ManagedOperationParameter(name = "date", description = "date"))
    public void pong(Date date) {
        System.out.println(date);
    }


    @ManagedOperation
    @ManagedOperationParameters(@ManagedOperationParameter(name = "date", description = "date of format yyyy-MM-dd"))
    public void pong(String date) throws Exception {
        pong(new SimpleDateFormat("yyyy-MM-dd").parse(date));
    }

}
