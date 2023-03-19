package richard.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import richard.springframework.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController controller;



    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}