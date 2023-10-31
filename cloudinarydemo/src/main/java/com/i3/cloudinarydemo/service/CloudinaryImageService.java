package com.i3.cloudinarydemo.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CloudinaryImageService {
    public Map upload(MultipartFile multipartFile);
}
