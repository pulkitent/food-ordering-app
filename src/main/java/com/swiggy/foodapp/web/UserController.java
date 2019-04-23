package com.swiggy.foodapp.web;

import com.swiggy.foodapp.shared.User;
import com.swiggy.foodapp.service.ServiceLayerException;
import com.swiggy.foodapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class UserController {
    private UserService userService = null;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/users")
    public User createUser(/*@Valid*/ @RequestBody User user) throws ServiceLayerException {
        return userService.create(user);
    }

    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable(value = "id") Long userId) throws ServiceLayerException {
        User user = userService.findUser(userId);
        return user;
    }

    @GetMapping("/users")
    //@RequestMapping(value = "/users", method = RequestMethod.GET)
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

    @RequestMapping("/greeting")
    public String greeting() {
        return "Pulkit";
    }
}