/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Purchase;
import org.javabase.apps.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 10, 2017
 */
@Service
public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	PurchaseRepository repo;
	
	@Override
	@Transactional(readOnly=true)
	public Purchase findOne(Integer id) {
		return repo.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Purchase> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean exists(Integer purchaseId) {
		return repo.exists(purchaseId);
	}

	@Override
	@Transactional
	public Purchase save(Purchase purchase) {
		return repo.save(purchase);
	}

	@Override
	@Transactional
	public Purchase update(Purchase purchase) {
		return repo.save(purchase);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		repo.delete(id);
	}

}
