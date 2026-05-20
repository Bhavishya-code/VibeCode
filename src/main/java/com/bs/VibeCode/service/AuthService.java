package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.auth.AuthResponse;
import com.bs.VibeCode.dto.auth.LoginRequest;
import com.bs.VibeCode.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
