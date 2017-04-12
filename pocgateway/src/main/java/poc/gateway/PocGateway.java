package poc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pakz on 2017-04-12.
 */
@SpringBootApplication
@EnableZuulProxy
@ComponentScan
public class PocGateway {

  public static void main(String[] args) {
    SpringApplication.run(PocGateway.class, args);
  }

}
