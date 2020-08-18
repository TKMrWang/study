import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }
}
