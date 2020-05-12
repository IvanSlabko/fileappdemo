package com.slabko.fileappdemo.security.jwt;

import com.slabko.fileappdemo.model.Role;
import com.slabko.fileappdemo.model.Status;
import com.slabko.fileappdemo.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {
    public JwtUserFactory() {

    }

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getUsername(), user.getFirstname(),
                user.getLastname(), user.getPassword(), user.getEmail(),
                user.getStatus().equals(Status.ACTIVE), user.getUpdated(),
                mapToGrantedAuthority(new ArrayList<>(user.getRoles())));
    }

    private static List<GrantedAuthority> mapToGrantedAuthority(List<Role> userRoles) {
        return userRoles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
