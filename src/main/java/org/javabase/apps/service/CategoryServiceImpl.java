/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Category;
import org.javabase.apps.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 9, 2017
 */
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository repo;
	
	@Override
	@Transactional(readOnly=true)
	public Category findOne(Integer id) {
		return repo.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public boolean exists(Integer categoryId) {
		return repo.equals(categoryId);
	}

	@Override
	@Transactional
	public Category save(Category category) {
		return repo.save(category);
	}

	@Override
	@Transactional
	public Category update(Category category) {
		return repo.save(category);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		repo.delete(id);
	}

}
