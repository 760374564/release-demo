package com.shanke.release.demo.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ReleaseDemoModule2Starter {
    public static void main(String[] args) {
        SpringApplication.run(ReleaseDemoModule2Starter.class, args);
    }

    @GetMapping("/hello/{ok}")
    public ResponseEntity<String> ok(@PathVariable("ok") String ok) {
        return ResponseEntity.ok("Hello " + ok + " !");
    }
}
