package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author rfortes on 21/11/20
 */
@Service
public class ConstructorGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World --- Constructor";
  }
}
