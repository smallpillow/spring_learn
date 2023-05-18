
import com.sun.dao.UserDao;
import com.sun.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) throws InterruptedException {

        // 容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // UserService userService = applicationContext.getBean(UserService.class);
        // System.out.println(userDao);
        // userDao.show();
        // System.out.println(userService);
        // userService.show();

        Object otherBean = applicationContext.getBean("otherBean");
        System.out.println(otherBean);

        Object dataSource = applicationContext.getBean("dataSource");
        System.out.println(dataSource);
        applicationContext.close();
    }


}
