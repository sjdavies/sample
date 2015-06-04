package au.nla.sjdavies.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles home page requests.
 * 
 * @since Jun 2, 2015
 * @author Stephen Davies
 */
@Controller
public class HomeController {

	@RequestMapping({"/", "/home"})
	public String showHomePage() {
		return "home";
	}

}
