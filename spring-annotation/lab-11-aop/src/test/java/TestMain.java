import com.itxiaobai.wx.bean.Calculator;
import com.itxiaobai.wx.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {


    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Calculator bean = applicationContext.getBean(Calculator.class);
        int div = bean.div(2, 1);
        System.out.println(div);
    }
}
