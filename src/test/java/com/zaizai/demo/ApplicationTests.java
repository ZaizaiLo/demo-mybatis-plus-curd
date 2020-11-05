package com.zaizai.demo;

import com.zaizai.demo.entity.User;
import com.zaizai.demo.entity.vo.AddUserVo;
import com.zaizai.demo.service.UserService;
import com.zaizai.demo.utils.MD5Utils;
import com.zaizai.demo.utils.RandomUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    public void insertUserBatch() {
        for (int i = 0; i < 30; i++) {
            User user = new User();
            user.setUserName(RandomUtils.getChineseName());
            user.setNickname(RandomUtils.getChineseName());
            if (i % 3 == 0) {
                user.setUserGender("男");
            } else {
                user.setUserGender("女");
            }
            user.setPassword(MD5Utils.inputPassToFormPass("123456"));
            user.setUserPhone(RandomUtils.getTel());
            user.setUserEmail(RandomUtils.getEmail(5, 9));
            userService.save(user);
        }
    }

}
