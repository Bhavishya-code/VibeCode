package com.bs.VibeCode.service.impl;

import com.bs.VibeCode.dto.project.ProjectRequest;
import com.bs.VibeCode.dto.project.ProjectResponse;
import com.bs.VibeCode.dto.project.ProjectSummaryResponse;
import com.bs.VibeCode.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return null;
    }

    @Override
    public ProjectResponse getUserProjectId(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
