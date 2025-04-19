package com.zfl19.leipicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.zfl19.leipicturebackend.mapper")
public class LeiPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeiPictureBackendApplication.class, args);
    }

}
