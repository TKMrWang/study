import com.itxiaobai.wx.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
        //调用getObject创建的对象
        Object person = applicationContext.getBean("personFactoryBean");
        Object person1 = applicationContext.getBean("personFactoryBean");
        System.out.println(person == person1);
        System.out.println(person.getClass());

        //通过&前缀获取工厂Bean本身的对象
        Object bean = applicationContext.getBean("&personFactoryBean");
        System.out.println(bean.getClass());
    }
}
