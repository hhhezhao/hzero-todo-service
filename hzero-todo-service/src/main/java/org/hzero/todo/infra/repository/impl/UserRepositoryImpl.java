package org.hzero.todo.infra.repository.impl;

import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.todo.domain.entity.User;
import org.hzero.todo.domain.repository.UserRepository;
import org.springframework.stereotype.Component;


/**
 *
 * 用户资源库实现
 *
 * @Author : HZ
 * @Date: 2020-07-14 20:37
 */
@Component
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {
}
