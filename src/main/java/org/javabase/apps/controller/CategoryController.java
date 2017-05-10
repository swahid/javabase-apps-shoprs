/**
 * 
 */
package org.javabase.apps.controller;

import java.util.List;

import org.javabase.apps.entity.Category;
import org.javabase.apps.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 10, 2017
 */
@RestController
@RequestMapping(value="/shoprs/category")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "View a list of available Category",response = Category.class)
    public List<Category> list(){
    	List<Category> category = service.findAll();
        return category;
    }

}
