package org.suliga.arch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArchMainController {
	private static final Logger logger = LoggerFactory.getLogger(ArchMainController.class);
	
	@GetMapping({"/", "/index", "/home"})
	public String getHome() {
		return "home";
	}
}
