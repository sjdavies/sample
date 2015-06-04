package au.nla.sjdavies.sample;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for Person based data.
 * 
 * @since Jun 2, 2015
 * @author Stephen Davies
 */
@Controller
public class PersonController {

	@RequestMapping({"/person"})
	public String showAll(Map<String, Object> model) {
		
		return "person";
	}

}
