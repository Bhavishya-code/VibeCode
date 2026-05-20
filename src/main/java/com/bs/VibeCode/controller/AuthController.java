package com.bs.VibeCode.controller;

import com.bs.VibeCode.dto.auth.AuthResponse;
import com.bs.VibeCode.dto.auth.LoginRequest;
import com.bs.VibeCode.dto.auth.SignupRequest;
import com.bs.VibeCode.dto.auth.UserProfileResponse;
import com.bs.VibeCode.service.AuthService;
import com.bs.VibeCode.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@FieldDefaults(makeFinal = true, level= AccessLevel.PRIVATE)
public class AuthController {

     AuthService authService;
     UserService userService;

    @PostMapping("/singup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest request){
         return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){

        Long userId= 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }

}

