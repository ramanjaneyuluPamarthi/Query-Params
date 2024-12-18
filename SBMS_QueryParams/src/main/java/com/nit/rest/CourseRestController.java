package com.nit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class CourseRestController {

	@GetMapping(value = "/course")
	public String getCourseDtls(@RequestParam String cname,@RequestParam() String tname) {
		String msg = cname+" by "+tname+" Is Ready To Start..";
		return msg;
	}
}
