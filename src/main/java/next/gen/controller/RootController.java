package next.gen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RootController {
	
	Logger logger = LoggerFactory.getLogger(RootController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String root() {
		logger.info("redirect to index.html");
		return "redirect:/index.html";
	}

}
