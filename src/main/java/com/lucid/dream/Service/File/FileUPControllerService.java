package com.lucid.dream.Service.File;

import com.lucid.dream.domain.posts.payload.FileUploadResponse;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileUPControllerService {
    FileUploadResponse uploadFile(MultipartFile file);

    List<FileUploadResponse> uploadFiles(MultipartFile[] files);

    ResponseEntity<Resource> downloadFiles(String fileName);
}
