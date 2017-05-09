/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Cart;
import org.javabase.apps.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 9, 2017
 */
@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository repo;

	@Override
	@Transactional(readOnly=true)
	public Cart findOne(Integer id) {
		return repo.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Cart> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean exists(Integer cartId) {
		return repo.equals(cartId);
	}

	@Override
	@Transactional
	public Cart save(Cart cart) {
		return repo.save(cart);
	}

	@Override
	@Transactional
	public Cart update(Cart cart) {
		return repo.save(cart);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		repo.delete(id);
	}

}
