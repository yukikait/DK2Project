package youtube.dk2.springboot.common.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	public static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/")
	@ResponseBody
	public String home(@RequestParam Map<String, Object> param, Model model) {
		
		return "Hello DK2 World";
	}
	

	@RequestMapping(value = "/welcome")
	public String welcome(@RequestParam Map<String, Object> param, Model model) {
		
		model.addAttribute("wcStr", "Welcome DK2 World!!");
		
		return "welcome";
	}
	
	
	

}
