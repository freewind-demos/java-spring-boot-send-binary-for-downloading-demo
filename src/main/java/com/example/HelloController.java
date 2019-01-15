package com.example;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public ResponseEntity<byte[]> index() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=myfile.bin");
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }

}
