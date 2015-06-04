package au.nla.sjdavies.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Lists all Persons in the database.
 * 
 * @since Jun 2, 2015
 * @author Stephen Davies
 */
@Controller
public class PeopleController {

	private SampleDao dao;
	
	@Autowired
	public void setSampleDao(SampleDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping({"/people"})
	public String showAll(Model model) {

		model.addAttribute("people", dao.allPersons());
		
		return "people";
	}

}
