import com.sun.dao.UserDao;
import com.sun.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        // 创建工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 创建读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // 读取器绑定工厂
        reader.loadBeanDefinitions("beans.xml");
        //根据id获得对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        System.out.println(userDao);

    }

    @Test
    public void Testes(){
        int[] numbers = { 43, 32, 53, 54, 75, 7, 10 };
        for (int item : numbers) {
            System.out.println("Count is:" + item);
        }
    }

}
