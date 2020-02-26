package com.mahesh.project.petclinicconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PetclinicconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetclinicconfigserverApplication.class, args);
    }

}
