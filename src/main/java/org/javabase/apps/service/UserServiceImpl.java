/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.User;
import org.javabase.apps.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 1, 2017
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repo;
	
	@Override
	@Transactional(readOnly=true)
	public User findOne(Integer id) {
		return repo.findOne(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public User save(User user) {
		return repo.save(user);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	@Transactional
	public User update(User user) {
		return repo.save(user);
	}

	@Override
	@Transactional(readOnly=true)
	public boolean exists(Integer userId) {
		return repo.exists(userId);
	}

}
