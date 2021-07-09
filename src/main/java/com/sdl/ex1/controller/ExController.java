package com.sdl.ex1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex1")
public class ExController {

	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Object ex1() throws Exception{
		Map<String, String> rs = new HashMap<String, String>();
		rs.put("att1", "test1");
		rs.put("att2", "test2");
		return rs;
	}
}
