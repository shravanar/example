package com.github.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoControllerTest {

    @Autowired
    DemoController demoController;

    @Test
    void test_healthCheck () {
        String response = demoController.healthCheck();
        Assertions.assertEquals(response, "Example App is up and running");
    }
}
