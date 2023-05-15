
import com.sun.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) throws InterruptedException {

        // 容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
//        System.out.println(userService);
        userService.show();

        //根据id获得对象
//        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
//        userDao.show();
//        Object userDaoFromStaticFactory = applicationContext.getBean("userDaoFromStaticFactory");
//        Object userDaoFromFactory = applicationContext.getBean("userDaoFromFactory");
//        Object userDaoFromBeanFactory1 = applicationContext.getBean("userDaoFromBeanFactory");
//        Object userDaoFromBeanFactory2 = applicationContext.getBean("userDaoFromBeanFactory");
//        System.out.println(userDaoFromBeanFactory1);
//        System.out.println(userDaoFromBeanFactory2);
//        applicationContext.getBean("userDaoFromBeanFactory", UserDao.class);
    }
}
