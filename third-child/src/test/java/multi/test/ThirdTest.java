package multi.test;

import multi.test.config.ExtraTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {ExtraTestConfig.class, TestConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ThirdTest {//extends BaseTest {

//    @Autowired
//    Dimmer dimmer;
    @Autowired
    HighBeam highBeam;

    @Test
    public void thirdTest() {
//        System.out.println(dimmer.getName());
        System.out.println(highBeam.getName());
    }
}
