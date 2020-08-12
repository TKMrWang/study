import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Test {

    @org.junit.Test
    public void test(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
        System.out.println(personMap);
    }
}
