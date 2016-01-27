/**
 * 
 */
package com.zpd.service.impl;

import java.util.List;

import com.zpd.dao.IUserDao;
import com.zpd.pojo.User;
import com.zpd.service.IUserService;
import com.zpd.utils.Paginate;

/**
 * @author Administrator
 *
 */
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int save(User t) {
		return this.userDao.save(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCount(int key, int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> initTop(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> paginate(Paginate pag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> paginate(int key, int value, Paginate pag) {
		// TODO Auto-generated method stub
		return null;
	}

}
