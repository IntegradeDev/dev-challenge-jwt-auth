package com.integrade.jwt_login.autthentication.service;

import com.integrade.jwt_login.dto.LoginRequestDTO;
import com.integrade.jwt_login.dto.TokenResponseDTO;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<TokenResponseDTO> login(LoginRequestDTO request);
}
