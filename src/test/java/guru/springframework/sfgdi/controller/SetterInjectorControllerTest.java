package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author rfortes on 21/11/20
 */
class SetterInjectorControllerTest {

    SetterInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectorController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
