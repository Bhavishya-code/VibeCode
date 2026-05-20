package com.bs.VibeCode.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user

) {
}
