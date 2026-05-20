package com.bs.VibeCode.service;


import com.bs.VibeCode.dto.auth.UserProfileResponse;

public interface UserService {


    UserProfileResponse getProfile(Long userId);
}
