package org.octopusbaby.basketball.dao;

import org.apache.ibatis.annotations.Param;
import org.octopusbaby.basketball.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 验证
     */
    User getUser(@Param("userName") String userName, @Param("password") String password);

    /**
     * 验证
     *
     * @param user
     * @return
     */
    User checkUser(User user);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 通过用户名称获取用户
     * @param userName
     * @return
     */
    User getUserByName(@Param("userName") String userName);

    /**
     * 根据用户名删除用户
     *
     * @param userName
     * @return
     */
    int delByName(@Param("userName") String userName);

    /**
     * 根据用户名更改用户密码
     *
     * @param userName
     * @param password
     * @return
     */
    int modifyPwdByName(@Param("userName") String userName,
                        @Param("password") String password);
}
