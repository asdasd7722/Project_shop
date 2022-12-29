package org.example.service;

import org.example.domain.User;

public interface UserService {
    User getUserInfo(int user_id);
    void createUser(User user);
    void updateUserInfo(User user, int user_id);
    void deleteUser(int user_id);
}
