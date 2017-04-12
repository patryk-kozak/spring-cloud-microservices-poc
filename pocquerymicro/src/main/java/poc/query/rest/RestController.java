package poc.query.rest;

import java.util.Collections;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pakz on 2017-04-12.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/dummy", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity getDataFromQuery() {
    return new ResponseEntity(Collections.singletonMap("response", "dummy_data_from_query"), HttpStatus.OK);
  }

  @RequestMapping("/simple")
  public ResponseEntity getDataFromCommandAndQuery() {
    return new ResponseEntity("data_only_from_query", HttpStatus.OK);
  }

}
