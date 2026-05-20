package com.bs.VibeCode.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
