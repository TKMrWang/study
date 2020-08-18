import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev");
        applicationContext.register(MyConfig.class);
        applicationContext.refresh();

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name :beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name :beanDefinitionNames){
            System.out.println(name);
        }
    }
}
