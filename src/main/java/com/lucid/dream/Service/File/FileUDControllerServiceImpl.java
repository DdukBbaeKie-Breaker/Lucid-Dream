package com.lucid.dream.Service.File;

import com.lucid.dream.domain.posts.payload.FileUploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileUDControllerServiceImpl implements FileUPControllerService{

    @Autowired
    private FileUploadDownloadService service;

    @Override
    public FileUploadResponse uploadFile(MultipartFile file) {
        String fileName = service.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }

    @Override
    public List<FileUploadResponse> uploadFiles(MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<Resource> downloadFiles(String fileName) {
        Resource resource = service.loadFileAsResource(fileName);

        String contentType = null;
        try {
            contentType = Files.probeContentType(Paths.get(resource.getURI()));

        } catch (IOException ex) {
            System.out.println("a");
        }

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
