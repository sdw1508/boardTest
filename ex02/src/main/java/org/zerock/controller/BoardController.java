package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BoardController {
	
	@RequestMapping(value="/board/list")
	public String list() {
		System.out.println("### listController");
		return "board/list";
	}

}
