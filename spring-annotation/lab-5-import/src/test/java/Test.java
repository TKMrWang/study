import com.itxiaobai.wx.config.MyConfig;
import com.itxiaobai.wx.config.MyConfig2;
import com.itxiaobai.wx.config.MyConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }

    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig2.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig3.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
}
