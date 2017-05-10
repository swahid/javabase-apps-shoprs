/**
 * 
 */
package org.javabase.apps.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Cart;
import org.javabase.apps.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 10, 2017
 */
@RestController
@RequestMapping("shoprs/cart")
public class CartController {
	
	@Autowired
	CartService service;
	
	@GetMapping(produces = "application/json")
	@ApiOperation(value = "View a list of available cart",response = Cart.class)
    public List<Cart> list(){
    	List<Cart> cart = service.findAll();
        return cart;
    }
    
    @PostMapping(produces = "application/json")
    @ApiOperation(value = "save list of cart",response = Cart.class)
    public Map<String, Object> save(Cart cart){
    	Map<String, Object> response = new HashMap<>();
    	service.save(cart);
    	response.put("code", 200);
    	response.put("message", "save success");
    	response.put("date", cart);
    	return response;
    }
    
    @DeleteMapping(produces = "application/json")
    @ApiOperation(value = "delete cart id",response = Cart.class)
    public Map<String, Object> save(int id){
    	Map<String, Object> response = new HashMap<>();
    	service.delete(id);
    	response.put("code", 200);
    	response.put("message", "save success");
    	response.put("date", id);
    	return response;
    }

    @PutMapping(produces = "application/json")
    @ApiOperation(value = "update carts",response = Cart.class)
    public Map<String, Object> update(Cart cart){
    	Map<String, Object> response = new HashMap<>();
    	service.update(cart);
    	response.put("code", 200);
    	response.put("message", "save success");
    	response.put("date", cart);
    	return response;
    }

}
