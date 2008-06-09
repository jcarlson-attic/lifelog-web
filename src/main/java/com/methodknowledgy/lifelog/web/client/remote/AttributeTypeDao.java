package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.AttributeType;
import com.methodknowledgy.lifelog.web.client.remote.impl.AttributeTypeDaoImpl;

public class AttributeTypeDao implements AsyncAttributeTypeDao {

	private static AttributeTypeDao instance;

	private AsyncAttributeTypeDao impl = (AsyncAttributeTypeDao) GWT
			.create(AttributeTypeDaoImpl.class);

	private AttributeTypeDao() {
		
	}
	
	public static AttributeTypeDao getInstance() {
		if (instance == null) {
			instance = new AttributeTypeDao();
		}
		return instance;
	}
	
	public void delete(AttributeType attributeType, AsyncCallback<?> callback) {
		impl.delete(attributeType, callback);
	}

	public void getAll(AsyncCallback<Collection<AttributeType>> callback) {
		impl.getAll(callback);
	}

	public void getById(Long id, AsyncCallback<AttributeType> callback) {
		impl.getById(id, callback);
	}

	public void save(AttributeType attributeType, AsyncCallback<?> callback) {
		impl.save(attributeType, callback);
	}

}
