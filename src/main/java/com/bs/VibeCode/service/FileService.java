package com.bs.VibeCode.service;

import com.bs.VibeCode.dto.project.FileContentResponse;
import com.bs.VibeCode.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
