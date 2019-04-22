package com.swiggy.service;

import java.util.List;
import java.util.Optional;
import com.swiggy.shared.User;
import com.swiggy.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {
    private UserRepository userRepository = null;

    @Autowired
    UserService(UserRepository userRepository) throws ServiceLayerException {
        try {
            this.userRepository = userRepository;
        } catch (Exception ex) {
            throw new ServiceLayerException(ex.getMessage());
        }
    }

    public User create(User user) throws ServiceLayerException {
        try {
            User savedUser = userRepository.save(user);
            return savedUser;
        } catch (Exception ex) {
            throw new ServiceLayerException(ex.getMessage());
        }

    }

    public User findUser(Long userId) throws ServiceLayerException {
        try {
            User user = userRepository
                    .findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found on :: " + userId));
            return user;
        } catch (Exception ex) {
            throw new ServiceLayerException(ex.getMessage());
        }
    }

    public List<User> findAll() throws ServiceLayerException {
        try {
            return userRepository.findAll();
        } catch (Exception ex) {
            throw new ServiceLayerException(ex.getMessage());
        }
    }

    public User updateUserEmail(Long userId, User updatedUser) throws ServiceLayerException {
        try {
            User user = userRepository
                    .findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found on :: " + userId));

            user.setEmailId(updatedUser.getEmailId());
            updatedUser = userRepository.save(user);
            return updatedUser;
        } catch (Exception ex) {
            throw new ServiceLayerException(ex.getMessage());
        }
    }

    public User delete(Long userId) throws ServiceLayerException {
        try {
            Optional<User> user = userRepository.findById(userId);
            userRepository.delete(user.get());
            return user.get();
        } catch (Exception ex) {
            throw new ServiceLayerException(ex.getMessage());
        }
    }
}
