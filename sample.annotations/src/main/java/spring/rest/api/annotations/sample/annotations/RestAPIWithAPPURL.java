package spring.rest.api.annotations.sample.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9091/message

@RestController
@RequestMapping("/app")
public class RestAPIWithAPPURL {
	
	@GetMapping(path="/message")
	public String getMsg() {
		return "Good moring";
	}

}
