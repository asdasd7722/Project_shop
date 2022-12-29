package org.example.controller;

import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        return "create user";
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
    public User UserInfo(@PathVariable("user_id") int user_id){
        return userService.getUserInfo(user_id);
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user, @PathVariable("user_id") int user_id) {
        userService.updateUserInfo(user, user_id);
        return "update user";
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("user_id") int user_id) {
        userService.deleteUser(user_id);
        return "delete user";
    }
}