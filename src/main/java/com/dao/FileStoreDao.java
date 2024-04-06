package com.dao;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileStoreDao {


    public String saveImageToStore(String uploadDirectory, MultipartFile image) throws IOException {

        String uniqueFileName = UUID.randomUUID().toString()+"_"+image.getOriginalFilename();
        Path uploadPath =Path.of(uploadDirectory);
        Path filePath = uploadPath.resolve(uniqueFileName);

        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }

        Files.copy(image.getInputStream(),filePath, StandardCopyOption.REPLACE_EXISTING);


        return uniqueFileName;

    }


}
