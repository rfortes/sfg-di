package guru.springframework.sfgdi.services;

/**
 * @author rfortes on 21/11/20
 */
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World";
  }
}
