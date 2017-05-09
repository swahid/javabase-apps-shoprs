/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Category;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 1, 2017
 */
public interface CategoryService {
	
	public Category findOne(Integer id);
	public List<Category> findAll();
	public boolean exists(Integer categoryId);
	public Category save(Category category);
	public Category update(Category category);
	public void delete(Integer id);

}
