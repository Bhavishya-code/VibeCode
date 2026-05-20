package com.bs.VibeCode.dto.member;

import com.bs.VibeCode.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole roel
) {
}
