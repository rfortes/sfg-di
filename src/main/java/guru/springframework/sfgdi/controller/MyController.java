package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

/**
 * @author rfortes on 20/11/20
 */
@Controller
public class MyController {

  public String sayHello(){
    System.out.println("Hello World!");

    return "Hello Folks";
  }

}
