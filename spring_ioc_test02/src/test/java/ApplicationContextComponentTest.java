
import com.sun.beans.OtherBean;
import com.sun.config.SpringConfig;
import com.sun.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextComponentTest {
    public static void main(String[] args) throws InterruptedException {

        // 配置文件方式
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 指定环境
        System.setProperty("spring.profiles.active", "test");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Object otherBean = applicationContext.getBean(OtherBean.class);
        System.out.println(otherBean);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();
        applicationContext.close();
    }
}
