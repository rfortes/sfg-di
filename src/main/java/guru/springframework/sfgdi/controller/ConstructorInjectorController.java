package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * @author rfortes on 21/11/20
 */
public class ConstructorInjectorController {

    private GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
