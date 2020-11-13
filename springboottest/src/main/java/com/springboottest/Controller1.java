package com.springboottest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sss")
public class Controller1 {
	@RequestMapping("/www")
	public String test() {
		return "u觉得胡";
	}
}
