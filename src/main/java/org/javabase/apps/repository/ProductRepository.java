/**
 * 
 */
package org.javabase.apps.repository;

import org.javabase.apps.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 9, 2017
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
