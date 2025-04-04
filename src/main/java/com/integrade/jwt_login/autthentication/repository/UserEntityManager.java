package com.integrade.jwt_login.autthentication.repository;


import com.integrade.jwt_login.model.User;

public interface UserEntityManager {
    User findByEmail(String email);
}
