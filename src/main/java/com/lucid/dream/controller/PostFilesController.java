package com.lucid.dream.controller;

import com.lucid.dream.Service.File.FileUDControllerServiceImpl;
import com.lucid.dream.domain.payload.response.FileUploadResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@AllArgsConstructor
public class PostFilesController {

    @Autowired
    private final FileUDControllerServiceImpl fileUDP;

    @PostMapping("/uploadFile")
    public FileUploadResponse uploadFile(@RequestParam("file")MultipartFile file) {

        return fileUDP.uploadFile(file);
    }

    @PostMapping("/uploadMultipleFiles")
    public List<FileUploadResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {

        return fileUDP.uploadFiles(files);
    }

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName) {

        return fileUDP.downloadFiles(fileName);
    }

}
