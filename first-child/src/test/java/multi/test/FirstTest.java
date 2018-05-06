package multi.test;

import multi.test.config.FirstConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {TestConfig.class, FirstConfig.class} )
@RunWith(SpringJUnit4ClassRunner.class)
public class FirstTest {//extends BaseTest {

    @Autowired
    private Dimmer dimmer;

    @Test
    public void contextTest() throws Exception {
        dimmer.setName("first dimmer");
        System.out.println(dimmer.getName());
    }
}
