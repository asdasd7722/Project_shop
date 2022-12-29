package org.example.service;

import org.example.domain.User;
import org.example.repository.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserInfo(int user_id) {
        return userMapper.getUserById(user_id);
    }

    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public void updateUserInfo(User user, int user_id) {
        userMapper.updateUser(user, user_id);
    }

    @Override
    public void deleteUser(int user_id) {
        userMapper.deleteUserById(user_id);
    }
}
