package com.zpd.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.WriteConcern;
import com.mongodb.WriteResult;
import com.zpd.dao.IShopDao;
import com.zpd.pojo.Shop;
import com.zpd.utils.BeanUtil;
import com.zpd.utils.Paginate;

/**
 * @author Administrator
 *
 */
public class ShopDaoImpl implements IShopDao {
	// private static Logger log = LogFactory.getLogger(ShopDaoImpl.class);
	private MongoTemplate mongoTemplate;

	/**
	 * set mongo Template
	 * 
	 * @param mongoTemplate
	 */
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public int save(Shop t) {
		int result = -1;
		DBCollection collection = this.mongoTemplate.getCollection("shop");
		List<DBObject> dbList = new ArrayList<DBObject>();
		BasicDBObject doc1 = new BasicDBObject();
		try {
			doc1 = (BasicDBObject) BeanUtil.bean2DBObject(t);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		dbList.add(doc1);
		collection.setWriteConcern(WriteConcern.SAFE);
		WriteResult writeResult = collection.insert(dbList);
		if (null != writeResult) {
			if (0 == writeResult.getN()) {
				result = dbList.size();
			}
		}
		return result;
	}

	@Override
	public int delete(int id) {
		int result = -1;
		DBCollection collection = this.mongoTemplate.getCollection("shop");
		BasicDBObject doc1 = new BasicDBObject();
		doc1.append("id", id);
		WriteResult writeResult = collection.remove(doc1);
		if (null != writeResult) {
			if (0 < writeResult.getN()) {
				result = writeResult.getN();
			}
		}
		return result;
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

	@Override
	public Integer insertList(List<Shop> list) {
		int result = -1;
		DBCollection collection = this.mongoTemplate.getCollection("shop");
		List<DBObject> dbList = new ArrayList<DBObject>();
		for (int i = 0; i < list.size(); i++) {
			BasicDBObject doc = new BasicDBObject();
			try {
				doc = (BasicDBObject) BeanUtil.bean2DBObject(list.get(i));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			dbList.add(doc);
		}
		collection.setWriteConcern(WriteConcern.SAFE);
		WriteResult writeResult = collection.insert(dbList);
		if (null != writeResult) {
			if (0 == writeResult.getN()) {
				result = dbList.size();
			}
		}
		return result;
	}

}
