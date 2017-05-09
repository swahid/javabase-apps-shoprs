/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Product;
import org.javabase.apps.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 9, 2017
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repo;

	@Override
	@Transactional(readOnly=true)
	public Product findOne(Integer id) {
		return repo.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean exists(Integer productId) {
		return repo.exists(productId);
	}

	@Override
	@Transactional
	public Product save(Product product) {
		return repo.save(product);
	}

	@Override
	@Transactional
	public Product update(Product product) {
		return repo.save(product);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		repo.delete(id);
	}

}
