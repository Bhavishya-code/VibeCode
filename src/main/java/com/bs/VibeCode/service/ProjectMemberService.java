package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.member.InviteMemberRequest;
import com.bs.VibeCode.dto.member.MemberResponse;
import com.bs.VibeCode.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);
}
