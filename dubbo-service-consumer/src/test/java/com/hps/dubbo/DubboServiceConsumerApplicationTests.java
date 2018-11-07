package com.hps.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hps.dubbo.bean.User;
import com.hps.dubbo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboServiceConsumerApplicationTests {

    @Reference
    private UserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(20);
        user.setEmail("zhangsan@gmail.com");
        System.out.println(userService.addUser(user));
    }

}
