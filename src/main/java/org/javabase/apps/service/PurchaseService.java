/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Purchase;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 1, 2017
 */
public interface PurchaseService {
	
	public Purchase findOne(Integer id);
	public List<Purchase> findAll();
	public boolean exists(Integer purchaseId);
	public Purchase save(Purchase purchase);
	public Purchase update(Purchase purchase);
	public void delete(Integer id);

}
