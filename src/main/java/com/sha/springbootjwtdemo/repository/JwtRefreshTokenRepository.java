package com.sha.springbootjwtdemo.repository;

import com.sha.springbootjwtdemo.model.JwtRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 23.07.2023
 * @time 14:05
 */
public interface JwtRefreshTokenRepository extends JpaRepository<JwtRefreshToken, String>
{
}
