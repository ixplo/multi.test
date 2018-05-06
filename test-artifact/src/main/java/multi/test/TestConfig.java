package multi.test;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

@TestConfiguration
//@ComponentScan("multi.test.config")
public class TestConfig implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        System.out.println("******* " + applicationEvent.getClass().getSimpleName()
                + " " + runtimeMXBean.getVmName()
                + " started " + runtimeMXBean.getStartTime() + " *******");
    }
}
