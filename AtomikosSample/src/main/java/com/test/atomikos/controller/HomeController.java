package com.test.atomikos.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.atomikos.service.facade.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public ModelAndView selectTest() {
		Map<String,String> map1 = new HashMap<>();
		map1.put("t1", "aaaa");
		map1.put("t2", "bbbb");
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("t1", "aaaa");
		map2.put("t2", "cccc");
		
		service.insertTest(map1, map2);
		
		return new ModelAndView("selectTest")
				.addObject("mssql", service.selectMssqlTest())
				.addObject("oracle", service.selectOracleTest());
	}
	
}
