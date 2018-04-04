package com.colin.repository;

import com.colin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/28 0028
 * time: 上午 11:21
 * description:
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
