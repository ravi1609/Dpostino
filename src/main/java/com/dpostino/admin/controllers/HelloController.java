package com.dpostino.admin.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dpostino.utility.IpAddress;


@Controller
@RequestMapping("/hello")
public class HelloController {

	
	//logger initialization
	private static final Logger logger=Logger.getLogger(HelloController.class);
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(ModelMap model) {
		logger.info("log .....this called");		
		model.addAttribute("message", "Hi From Dpostino"+IpAddress.getIp());
		System.out.print("you can start working here importhis in yourworkspce view");
		return "hello";
	}
	
	
}
