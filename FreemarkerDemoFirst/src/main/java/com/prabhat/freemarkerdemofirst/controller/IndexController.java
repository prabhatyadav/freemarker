package com.prabhat.freemarkerdemofirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class IndexController {

	@RequestMapping(path="/welcome/{name}",method= RequestMethod.GET,produces= {"text/html"})
	 public String getWelcomePage(@PathVariable("name") String name, Model model) {
		 return  "index";
	 }
	
	@RequestMapping(path="/welcome/static",method= RequestMethod.GET,produces= {"text/html"})
	 public String getWelcomeStaticPage( Model model) {
		 return  "statichtml";
	 }
	
	
	
}
