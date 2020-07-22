package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.configclient.config.ConfigProperties;
import com.example.configclient.config.GlobalProperties;

@RestController
public class HomeController {

	@Autowired
	private ConfigProperties props;

	@Autowired
	private GlobalProperties global;

	@GetMapping("/")
	public String home() {
		System.out.println(global.getPassword());
		return props.getGreeting();
	}

}
