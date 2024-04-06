package com.controller;

import com.dao.FileStoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/upload")
public class FileStoreController {

    @Autowired
    FileStoreDao fileStoreDao;
    @PostMapping("/file1")
    public ResponseEntity<?> uploadFile(@RequestParam("file")MultipartFile image) throws IOException {

        String uploadDirectory = "src/main/resources/static/images";
        String imageString = "";


        String filePath = fileStoreDao.saveImageToStore(uploadDirectory,image);

        return  new ResponseEntity<String>(filePath, HttpStatus.CREATED);


    }
}
