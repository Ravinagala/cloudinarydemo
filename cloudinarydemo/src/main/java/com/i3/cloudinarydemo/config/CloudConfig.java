package com.i3.cloudinarydemo.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudConfig {

    @Bean
    public Cloudinary getCloudinary(){
        Map config = new HashMap<>();
        config.put("cloud_name","dcp2jdncm");
        config.put("api_key","199135386147149");
        config.put("api_secret","SFRq3g6WVZ2OFog-kxXFT17MRzU");
        config.put("secure",true);
        return new Cloudinary(config);
    }


}
