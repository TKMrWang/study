import com.itxiaobai.wx.config.MyConfig;
import com.itxiaobai.wx.config.MyConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class TestMain {

    /**
     *Bean的生命周期包含：bean创建--->初始化---->销毁
     *容器管理bean的生命周期
     * 调用Bean(initMethod,destroyMethod)指定bean的初始化和销毁方法，可以在容器在进行bean的创建时调用我们自定义的初始化和销毁方法
     *  一、单实例：
     *      在容器创建时创建Bean，Bean创建完毕后调用initMethod，在调用applicationContext.close()时调用destroyMethod销毁bean
     *  二、多实例
     *      容器创建时不会创建Bean,在调用Bean的时候创建bean，调用Bean创建完毕后调用initMethod，容器关闭时不会销毁bean。多实例时Bean
     *      创建后容器就不在管理。
     *
     * 1、指定初始化方法和销毁方法：
     *      通过@Bean(initMethod,destroyMethod)指定初始化方法和销毁方法
     * 2、通过Bean实现InitializingBean定义初始化逻辑，DisposableBean定义销毁方法逻辑
     * 3、通过@PostConstruct定义初始化逻辑，通过@PreDestroy定义销毁方法逻辑
     * 4、
     */
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("容器创建完毕");

        //关闭容器
        applicationContext.close();

    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig2.class);
        System.out.println("容器创建完毕");
        applicationContext.getBean("person");
        //关闭容器
        applicationContext.close();
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("容器创建完毕");
        //关闭容器
        applicationContext.close();
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("容器创建完毕");
        //关闭容器
        applicationContext.close();
    }
}
