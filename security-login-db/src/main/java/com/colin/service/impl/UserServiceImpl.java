package com.colin.service.impl;

import com.colin.constant.RoleConstant;
import com.colin.entity.UserEntity;
import com.colin.repository.UserRepository;
import com.colin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@Primary
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(UserEntity user) {
        String username = user.getUsername();
        if (StringUtils.isEmpty(username))
            return;
        if (StringUtils.isEmpty(user.getPassword()))
            return;
        user.setPassword(encryptPassword(user));
        user.setRoles(RoleConstant.ROLE_USER);
        userRepository.save(user);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    private String encryptPassword(UserEntity userEntity) {
        return new BCryptPasswordEncoder().encode(userEntity.getPassword());
    }
}
