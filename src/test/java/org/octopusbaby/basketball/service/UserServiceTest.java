package org.octopusbaby.basketball.service;

import org.junit.Test;
import org.octopusbaby.basketball.BaseTest;
import org.octopusbaby.basketball.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testValidateUser() {
        User userCheck = new User();
        userCheck.setUserName("");
        userCheck.setPassword("");
        userCheck.setUserType("");
        User user = userService.validateUser(userCheck);
        System.out.println(user);
    }

    @Test
    public void testAddUser() {
        String user = "";
        String password = "";
        String type = "";
        boolean b = userService.addUser(user, password, type);
        if (b) {
            System.out.println("\n成功添加:" + user + " " + password);
        }
    }

    @Test
    public void testGainAllUser() {
        List<User> allUser = userService.gainAllUser();
        for (User user : allUser) {
            System.out.println("\n" + user);
        }
    }

    @Test
    public void testGainUserByName() {
        User user = userService.gainUserByName("admin");
        System.out.println("\n" + user);
    }

    @Test
    public void testDeleteByName() {
        String userName = "";
        boolean b = userService.deleteByName(userName);
    }

    @Test
    public void testModifyPwdByName() {
        String user = "";
        String password = "";
        boolean b = userService.modifyPwdByName(user, password);
    }
}
