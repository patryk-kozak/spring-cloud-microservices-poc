package poc.command.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pakz on 2017-04-12.
 */
@Component
public class PocQueryRepo {

  @Autowired
  private RestTemplate restTemplate;

  // static, should be configurable
  private static String queryRepoUrl = "http://poc-query";

  public WrapString getDummyDataFromQueryRepo() {
    return restTemplate.getForObject(queryRepoUrl + "/dummy", WrapString.class);
  }

}
