package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author rfortes on 21/11/20
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World ----- Primary";
  }
}
