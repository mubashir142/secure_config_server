package com.example.secure_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SecureConfigServerApplication {

 public static void main(String[] args) {
  SpringApplication.run(SecureConfigServerApplication.class, args);
 }

}