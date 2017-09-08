package com.pc.help;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/help")
public class CorsHelp {
	@Autowired
	private MockHelp mock;

	@GetMapping
	public List<Help> getList() {
		return mock.getList();
	}
}
