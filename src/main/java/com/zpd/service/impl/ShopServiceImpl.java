/**
 * 
 */
package com.zpd.service.impl;

import java.util.List;

import com.zpd.dao.IShopDao;
import com.zpd.pojo.Shop;
import com.zpd.service.IShopService;
import com.zpd.utils.ErrorCode;
import com.zpd.utils.Paginate;

/**
 * @author Administrator
 *
 */
public class ShopServiceImpl implements IShopService, ErrorCode {
	private IShopDao shopDao;

	public void setShopDao(IShopDao shopDao) {
		this.shopDao = shopDao;
	}

	@Override
	public int save(Shop t) {
		return this.shopDao.save(t) > 0 ? SUCCESS : FAILED;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Shop t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Shop get(int id) {
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
	public List<Shop> initTop(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shop> paginate(Paginate pag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shop> paginate(int key, int value, Paginate pag) {
		// TODO Auto-generated method stub
		return null;
	}

}
