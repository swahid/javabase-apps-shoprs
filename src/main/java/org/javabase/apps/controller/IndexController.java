/**
 * 
 */
package org.javabase.apps.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 9, 2017
 */
@RestController
@RequestMapping({"/","shoprs"})
public class IndexController{
	
	@GetMapping()
	public Map<String, Object> index(){
		Map<String, Object> response = new HashMap<>();
		response.put("code", 200);
		response.put("appName", "Shoprs");
		response.put("Desctiption", "Online Shoop restful Api");
		response.put("basepath", "/shoprs");
		response.put("version", "1.0.0");
		response.put("developer", "Saurav Wahid");
		
		return response;
	}
	
	

}
