
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import jungkulee.Model.Greeting;

/**
 * @author : Steven
 * @since : v2.0.0
 * @version : 1.0.0
 */

@RestController
@EnableAutoConfiguration
public class Example {
  @RequestMapping("/")
  public String home() {
    return "hello world!";
  }
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @Value("${greeting.bigNumber}")
  public long randomvalue;

  //http://localhost:8080/greeting?name=User
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new Greeting(counter.incrementAndGet(),
        String.format(template, name));
  }

  @RequestMapping("/randomvalue")
  public long randomvalue() {
    return randomvalue;
  }

  public static void main(String[] args) throws Exception {
    //SpringApplication.run(Example.class, args);
    SpringApplication app = new SpringApplication(Example.class);
    app.setShowBanner(true);

    app.addListeners(new ApplicationListener<ApplicationEvent>() {
      @Override
      public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("sample :"+ applicationEvent.getClass());
      }
    });
    //tomcat control
    //app.setWebEnvironment(false);
    app.run(args);


  }
}
