package in.arundathi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {
	@GetMapping("/wish")
	public ModelAndView wishMsg() {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("wish", "All the very Best..");
		mv.setViewName("wish");
		return mv;
	}

}
