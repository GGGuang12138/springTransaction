import com.gg.mapper.AccountMapper;
import com.gg.mapper.UserMapper;
import com.gg.model.Account;
import com.gg.model.User;
import com.gg.service.AccountService;
import com.gg.service.AccountServiceImpl;
import com.gg.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Creat by GG
 * Date on 2020/9/23  10:07 下午
 */
public class SpringTransactionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-transaction.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("gg");
        userService.createUser(user);



    }
}
