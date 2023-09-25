package com.sha.springbootjwtdemo.service;

import com.sha.springbootjwtdemo.model.JwtRefreshToken;
import com.sha.springbootjwtdemo.model.User;

/**
 * @author sa
 * @date 23.07.2023
 * @time 14:27
 */
public interface JwtRefreshTokenService
{
    JwtRefreshToken createRefreshToken(Long userId);

    User generateAccessTokenFromRefreshToken(String refreshTokenId);
}
