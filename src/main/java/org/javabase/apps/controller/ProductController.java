/**
 * 
 */
package org.javabase.apps.controller;

import java.util.List;

import org.javabase.apps.entity.Product;
import org.javabase.apps.service.ProductService;
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
@RequestMapping(value="/shoprs/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "View a list of available Purchase",response = Product.class)
    public List<Product> list(){
    	List<Product> product = service.findAll();
        return product;
    }

}
