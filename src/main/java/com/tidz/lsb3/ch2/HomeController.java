package com.tidz.lsb3.ch2;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	record Video(String name) {
	}

	List<Video> videos = List.of(new Video("VHS1"), new Video("Try not to Sleep"), new Video("The Dude!"));

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("videos", videos);
		return "index";
	}

}
