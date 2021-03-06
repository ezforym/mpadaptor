/**
 * 
 */
package com.zpd.dao;

import java.util.List;

import com.zpd.pojo.Shop;

/**
 * @author Administrator
 *
 */
public interface IShopDao extends IBaseDao<Shop> {
	/**
	 * 批量插入商铺信息
	 * 
	 * @param list
	 *            商铺集合
	 * @return 插入条数
	 */
	Integer insertList(List<Shop> list);
}
