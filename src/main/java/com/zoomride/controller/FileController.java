package com.zoomride.controller;

import com.zoomride.utils.utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api")
@Api(tags = "upload file api" )
public class FileController {

    @PostMapping("/file")
    @ApiOperation("upload imgs")
    public String coversUpload(MultipartFile file) throws Exception {
        String folder = "C:/Users/Tony/Desktop/Bohan/img";
        String oriName = file.getOriginalFilename();
        File imageFolder = new File(folder);
        File f = new File(imageFolder, utils.getRandomString(20) + file.getOriginalFilename()
                .substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        try {
            file.transferTo(f);
            String imgURL = "C:/Users/Tony/Desktop/Bohan/img/" + f.getName();
            return imgURL;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
