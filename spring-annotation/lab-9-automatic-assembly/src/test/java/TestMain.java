import com.itxiaobai.wx.config.MyConfig;
import com.itxiaobai.wx.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    /**
     * 一：@Autowired自动驻入
     * @Autowired 自动装配，id默认为类型首字母小写 首先根据类型自动匹配Bean，如果存在相同类型的Bean，再根据id属性匹配，
     *          可以使用required=false表示该Bean不必须，可以返回null
     * @Qualifier(id) 当存在多个相同类型的Bean时，明确指出使用哪个bean
     * @Primary 自动装配的时候，首选使用的bean，如果没有@Qualifier明确指出，首选使用@Primary修饰的Bean
     *      当@Qualifier与@Primary共同修饰时，使用@Qualifier指定的Bean
     * 二：@Resource和@Inject自动注入(java规范的注解)
     * @Resource 默认按照组件名称进行装配的
     * @Inject 功能与@Autowired一样，需要导入javax.inject包以后才能使用
     *
     *
     * @Autowired可以放在构造器、方法、参数、属性，@Autowired标注的都是从容器中获取参数组件的值
     *
     */
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.print();
        System.out.println(bean);
    }
}
