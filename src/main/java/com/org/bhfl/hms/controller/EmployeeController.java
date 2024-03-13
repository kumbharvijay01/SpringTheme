/**
 * 
 */
package com.org.bhfl.hms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */

@RestController
public class EmployeeController {

	@GetMapping("/allempdata")
	List<String> getEMpDAta(@RequestParam String uname, @RequestParam String psw) {
		List<String> empData = new ArrayList<>();
		if (uname == "admin@gmail.com") {
			empData.add("ABC");
			empData.add("ABC");
			empData.add("ABC");
			empData.add("ABC");
			empData.add("ABC");
			return empData;
		} else {
			return empData;
		}
	}

	@GetMapping("/employeelogin")
	public String login(@RequestParam String emailid, @RequestParam String password) {
		return "success";
	}

}
