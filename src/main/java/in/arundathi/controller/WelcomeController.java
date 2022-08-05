package in.arundathi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeMsg(Model m)
	{
		m.addAttribute("msg","Welcome to HCL ..");
		return "index";
	}

}
