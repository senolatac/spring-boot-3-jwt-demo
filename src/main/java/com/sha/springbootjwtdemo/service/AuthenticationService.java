package com.sha.springbootjwtdemo.service;

import com.sha.springbootjwtdemo.model.User;

/**
 * @author sa
 * @date 23.07.2023
 * @time 14:29
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
