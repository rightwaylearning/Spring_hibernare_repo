package rwl.apo.test.rwl_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class RestApiController {
	
	@Autowired
	MyService myService;
	
	@GetMapping("/message")
	public String getMessage() {
		return myService.getDataMessage();
	}

}
