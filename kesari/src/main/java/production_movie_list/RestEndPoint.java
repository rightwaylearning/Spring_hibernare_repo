package production_movie_list;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoint {

	@GetMapping(value = "message")
	public String getMessage() {
		return "Hi hello Good morning India....";
	}
}
