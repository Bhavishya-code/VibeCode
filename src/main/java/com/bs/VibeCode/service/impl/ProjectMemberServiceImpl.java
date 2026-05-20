package com.bs.VibeCode.service.impl;

import com.bs.VibeCode.dto.member.InviteMemberRequest;
import com.bs.VibeCode.dto.member.MemberResponse;
import com.bs.VibeCode.dto.member.UpdateMemberRoleRequest;
import com.bs.VibeCode.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }
}
