package epsilonwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/welcome")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("welcome");
		return mv;
	}
	

}
