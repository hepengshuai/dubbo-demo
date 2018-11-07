package com.hps.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hps.dubbo.bean.User;
import com.hps.dubbo.service.UserService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceImpl implements UserService {

    private static Map<Integer, User> map = new ConcurrentHashMap<>();

    @Override
    public User addUser(User user) {
        map.put(user.getId(), user);
        return user;
    }
}
