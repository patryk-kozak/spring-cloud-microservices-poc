package poc.command.rest;

import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import poc.command.repo.PocQueryRepo;
import poc.command.repo.WrapString;

/**
 * Created by pakz on 2017-04-12.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired PocQueryRepo pocQueryRepo;

  @RequestMapping("/simple")
  public ResponseEntity getDataFromCommand() {
    return new ResponseEntity("data_only_from_command", HttpStatus.OK);
  }

  @RequestMapping("/all")
  public ResponseEntity getDataFromCommandAndQuery() {
    /**
     * Cases:
     * 1. Packed into object to wrap to nice json (WrapString)
     * 2. Using CopyOnWriteArrayList to secure Thread from RestTemplate usage
     */
    CopyOnWriteArrayList<WrapString> returnList = new CopyOnWriteArrayList<WrapString>();
    returnList.add(pocQueryRepo.getDummyDataFromQueryRepo());
    returnList.add(new WrapString("data_only_from_command"));
    return new ResponseEntity(returnList , HttpStatus.OK);
  }

}
