package com.slabko.fileappdemo.security.jwt;

import com.slabko.fileappdemo.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtTokenProvider {

    public String createToken(String username, List<Role> role) {
        return null;
    }

    public Authentication getAuthentication(String token) {
        return null;
    }

    public String getUsername(String token) {
        return null;
    }
}
