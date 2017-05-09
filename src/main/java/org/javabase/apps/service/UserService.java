/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.User;

/**
 * @author 	Saurav Wahid <saurav1161@gail.com>
 * @version	1.0.0
 * @since	May 1, 2017
 */
public interface UserService {
	
	public User findOne(Integer id);
	public List<User> findAll();
	public boolean exists(Integer userId);
	public User save(User user);
	public User update(User user);
	public void delete(Integer id);

}
