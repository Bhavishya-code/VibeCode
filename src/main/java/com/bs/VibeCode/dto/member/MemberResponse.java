package com.bs.VibeCode.dto.member;

import com.bs.VibeCode.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
){
}
