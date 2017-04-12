package poc.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pakz on 2017-04-12.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan
public class PocQueryMicro {

  public static void main(String[] args) {
    SpringApplication.run(PocQueryMicro.class, args);
  }

}
