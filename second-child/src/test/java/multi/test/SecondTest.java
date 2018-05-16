package multi.test;

import multi.test.config.ExtraTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {ExtraTestConfig.class, TestConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class SecondTest {//extends BaseTest {

    @Autowired
    private HighBeam highBeam;

    @Test
    public void secondTest() throws Exception{
        System.out.println(highBeam.getName());
        Object lumen = ClassLoading.get();
    }
}
