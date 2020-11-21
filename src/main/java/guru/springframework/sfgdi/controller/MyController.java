package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author rfortes on 20/11/20
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting(){
        return greetingService.sayGreeting();
    }

}
