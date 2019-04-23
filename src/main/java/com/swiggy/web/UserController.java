package com.swiggy.web;

import com.swiggy.shared.User;
import com.swiggy.service.ServiceLayerException;
import com.swiggy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService = null;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/{id}")
    public User createUser(@Valid @RequestBody User user) throws ServiceLayerException {
        return userService.create(user);
    }

    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable(value = "id") Long userId) throws ServiceLayerException {
        return userService.findUser(userId);
    }

    @GetMapping("/users")
    public List<User> fetchAllUsers() throws ServiceLayerException {
        return userService.findAll();
    }

    @PatchMapping("/{id}")
    public User updateUserEmailbyId(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) throws ServiceLayerException {
        return userService.updateUserEmail(userId, userDetails);
    }

    @DeleteMapping("/{id}")
    public User deleteUserbyId(@PathVariable(value = "id") Long userId) throws ServiceLayerException {
        return userService.delete(userId);
    }
}