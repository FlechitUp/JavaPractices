package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mkyong.service.IUserService;


@Controller
public class WelcomeController {

	@Autowired
	private IUserService userService;
	// inject via application.properties
	@Value("${welcome.message:Xime}")
	private String message1 = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		userService.register("XIME");
		model.put("message", this.message1);
		return "welcome";
	}
	
}