import com.itxiaobai.wx.config.MyConfig;
import com.itxiaobai.wx.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    //没有事务控制，出错时插入数据存在，没有回滚
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        UserService bean = applicationContext.getBean(UserService.class);
//        bean.insertUser();
        bean.insertUserTx();
        applicationContext.close();
    }
}
