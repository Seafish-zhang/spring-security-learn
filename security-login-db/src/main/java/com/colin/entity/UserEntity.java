package com.colin.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/28 0028
 * time: 上午 11:18
 * description:
 */
@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "roles")
    private String roles;
}
