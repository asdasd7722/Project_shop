package org.example.repository;

import org.example.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void createUser(User user);

    User getUserById(int id);

    void updateUser(User user, int id);

    void deleteUserById(int id);
}
