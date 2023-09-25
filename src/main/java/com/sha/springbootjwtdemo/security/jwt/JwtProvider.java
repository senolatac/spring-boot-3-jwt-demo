package com.sha.springbootjwtdemo.security.jwt;

import com.sha.springbootjwtdemo.security.UserPrincipal;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

/**
 * @author sa
 * @date 23.07.2023
 * @time 14:33
 */
public interface JwtProvider
{
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
