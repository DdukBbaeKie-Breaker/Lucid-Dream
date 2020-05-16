package com.lucid.dream.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
public class PostImgControllr {

    @GetMapping
    public void setImge(@RequestParam("file") MultipartFile file) {

    }
}
