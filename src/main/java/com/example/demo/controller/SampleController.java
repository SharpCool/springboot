package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class SampleController {
	private final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping("/hello")
	String home() {
		logger.info("=========进入hello========");
		return "view/Hello";
	}

}