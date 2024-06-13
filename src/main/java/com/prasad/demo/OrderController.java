package com.prasad.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
public class OrderController {

    @GetMapping("/healthcheck")
    ResponseEntity<String> sayHello() throws InterruptedException {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        log.info("Inside order-api --> healthcheck");
        String responseText = "Order API healthcheck @ " + timeStamp + " - All OK";
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body(responseText.toString());
    }
}
