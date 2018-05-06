package multi.test.config;

import multi.test.Dimmer;
import multi.test.DimmerImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@TestConfiguration
public class FirstConfig {

    @Bean
    Dimmer dimmer() {
        Dimmer dimmer = new DimmerImpl();
        dimmer.setName("first Dimmer");
        return dimmer;
    }
}
