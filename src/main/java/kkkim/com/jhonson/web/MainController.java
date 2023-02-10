package kkkim.com.jhonson.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/test")
	public String test(Model model, @RequestParam(value="name",required=false, defaultValue="圈府隔府") String name) {
		model.addAttribute("name",name);
		return "test";
	}
	
	@RequestMapping("/vueSample")
	public String vueSample(Model model, @RequestParam(value="name",required=false, defaultValue="圈府隔府") String name) {
		model.addAttribute("name",name);
		return "/webPage/pageSample";
	}
}