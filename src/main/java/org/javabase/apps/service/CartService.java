/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Cart;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 1, 2017
 */
public interface CartService {
	
	public Cart findOne(Integer id);
	public List<Cart> findAll();
	public boolean exists(Integer CartId);
	public Cart save(Cart Cart);
	public Cart update(Cart Cart);
	public void delete(Integer id);

}
