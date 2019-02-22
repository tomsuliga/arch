package org.suliga.arch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MazeController {
	
	@GetMapping("/maze")
	public String getMaze() {
		return "maze";
	}
}
