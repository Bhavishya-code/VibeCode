package com.bs.VibeCode.service.impl;

import com.bs.VibeCode.dto.auth.AuthResponse;
import com.bs.VibeCode.dto.auth.LoginRequest;
import com.bs.VibeCode.dto.auth.SignupRequest;
import com.bs.VibeCode.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
