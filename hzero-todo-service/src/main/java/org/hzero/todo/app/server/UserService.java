package org.hzero.todo.app.server;

import org.hzero.todo.domain.entity.User;

/**
 * @Author : HZ
 * @Date: 2020-07-14 20:50
 */
public interface  UserService {
    /**
     * 创建用户
     *
     * @param user User
     * @return User
     */
    User create(User user);

    /**
     * 删除用户(同时删除任务)
     *
     * @param userId 用户ID
     */
    void delete(Long userId);
}
