/**
 * 
 */
package org.javabase.apps.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.User;
import org.javabase.apps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 9, 2017
 */
@RestController
@RequestMapping("shoprs/user")
@Api(value="onlinestore", basePath="shoprs/")
public class UserController {
	
	
	@Autowired
	UserService service;
	
    @ApiOperation(value = "View a list of available users",response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Application Internal Error check error log")
    })
    @GetMapping(produces = "application/json")
    public List<User> list(Model model){
    	List<User> user = service.findAll();
        return user;
    }
    
    @PostMapping(produces = "application/json")
    @ApiOperation(value = "save list of user",response = User.class)
    public Map<String, Object> save(User user){
    	Map<String, Object> response = new HashMap<>();
    	service.save(user);
    	response.put("code", 200);
    	response.put("message", "save success");
    	response.put("date", user);
    	return response;
    }
    
    @DeleteMapping(produces = "application/json")
    @ApiOperation(value = "delete user id",response = User.class)
    public Map<String, Object> save(int id){
    	Map<String, Object> response = new HashMap<>();
    	service.delete(id);
    	response.put("code", 200);
    	response.put("message", "save success");
    	response.put("date", id);
    	return response;
    }

    @PutMapping(produces = "application/json")
    @ApiOperation(value = "update users",response = User.class)
    public Map<String, Object> update(User user){
    	Map<String, Object> response = new HashMap<>();
    	service.update(user);
    	response.put("code", 200);
    	response.put("message", "save success");
    	response.put("date", user);
    	return response;
    }
}
