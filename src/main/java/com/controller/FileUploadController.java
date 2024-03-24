package com.controller;

import com.dao.FileDBDao;
import com.util.FileCustomeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    @Autowired
    private FileDBDao fileDBDao;

    @PostMapping("/file")
    public ResponseEntity<?> uploadFile(@RequestParam("file")MultipartFile file){
String message = "";
        try {
            fileDBDao.store(file);
            message = "file uploaded successfully";
            return ResponseEntity.status(HttpStatus.CREATED).body(new FileCustomeResponse(message));


        }catch (Exception e){
            message = "Error while upload file..";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new FileCustomeResponse(message));


        }

    }

}
