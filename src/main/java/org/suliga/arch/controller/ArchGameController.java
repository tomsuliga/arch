package org.suliga.arch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.suliga.arch.service.ArchGameService;

@Controller
public class ArchGameController {
	@Autowired private ArchGameService archGameService;
	
	@GetMapping("/archgame")
	public String getArchGame() {
		archGameService.getAllGames();
		return "archgame";
	}
}
