package com.example.asynctransactiondemo;

import com.example.asynctransactiondemo.storage.SomeEntity;
import com.example.asynctransactiondemo.storage.SomeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class SomeController {
    private static final Logger LOG = LoggerFactory.getLogger(SomeController.class);

    @Autowired
    private SomeRepository someRepository;

    @PostConstruct
    public void init() {
        someRepository.save(new SomeEntity());
    }

    @GetMapping("/test")
    public void test() {
        myAsyncMethod();
    }

    @Async
    @Transactional
    public void myAsyncMethod() {
        someRepository.streamAll().forEach(e -> LOG.info("Found {}", e.id));
    }
}
