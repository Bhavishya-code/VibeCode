package com.bs.VibeCode.service.impl;

import com.bs.VibeCode.dto.project.FileContentResponse;
import com.bs.VibeCode.dto.project.FileNode;
import com.bs.VibeCode.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
