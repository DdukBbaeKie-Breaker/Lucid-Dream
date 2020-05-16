package com.lucid.dream.exception;

import org.apache.tomcat.util.http.fileupload.FileUploadException;

public class CustomException extends RuntimeException{

    public FileUploadException(String message) {
        super(mes);
    }

}
