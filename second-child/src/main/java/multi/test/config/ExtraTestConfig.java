package multi.test.config;

import multi.test.HighBeam;
import multi.test.HighBeamImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtraTestConfig {

    @Bean
    HighBeam highBeam() {
        HighBeam highBeam = new HighBeamImpl();
        highBeam.setName("First HighBeam");
        return highBeam;
    }
}
