import com.itxiaobai.wx.config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
