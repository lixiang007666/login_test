package lixiang666.top.test;

import lixiang666.top.dao.UserDao;
import lixiang666.top.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testlogin(){
        User loginuser=new User();
        loginuser.setUsername("lx");
        loginuser.setPassword("123");
        UserDao dao=new UserDao();
        User user=dao.login(loginuser);
        System.out.println(user);
    }
}

