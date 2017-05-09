/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Product;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 1, 2017
 */
public interface ProductService {
	
	public Product findOne(Integer id);
	public List<Product> findAll();
	public boolean exists(Integer productId);
	public Product save(Product product);
	public Product update(Product product);
	public void delete(Integer id);

}
