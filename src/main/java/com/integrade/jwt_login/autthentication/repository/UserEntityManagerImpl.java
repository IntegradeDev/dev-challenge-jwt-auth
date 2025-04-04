package com.integrade.jwt_login.autthentication.repository;


import com.integrade.jwt_login.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserEntityManagerImpl {

    private final List<User> users = List.of(
            new User("admin@email.com", "123456")
    );
}
