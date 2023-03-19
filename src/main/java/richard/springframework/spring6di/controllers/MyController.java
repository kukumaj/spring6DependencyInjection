package richard.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;
import richard.springframework.spring6di.services.GreetingService;
import richard.springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the Controller");
        return greetingService.sayGreeting();
    }
}
