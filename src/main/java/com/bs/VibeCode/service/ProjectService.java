package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.project.ProjectRequest;
import com.bs.VibeCode.dto.project.ProjectResponse;
import com.bs.VibeCode.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectId(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
