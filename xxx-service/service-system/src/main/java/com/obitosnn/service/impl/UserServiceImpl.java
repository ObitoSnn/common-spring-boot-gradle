package com.obitosnn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.obitosnn.entity.User;
import com.obitosnn.service.UserService;
import com.obitosnn.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}
