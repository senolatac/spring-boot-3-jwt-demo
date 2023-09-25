package com.sha.springbootjwtdemo.service;

import com.sha.springbootjwtdemo.model.Role;
import com.sha.springbootjwtdemo.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author sa
 * @date 23.07.2023
 * @time 14:24
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);

    List<User> findAllUsers();
}
