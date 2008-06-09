package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Attribute;
import com.methodknowledgy.lifelog.web.client.remote.impl.AttributeDaoImpl;

public class AttributeDao implements AsyncAttributeDao {

	private static AttributeDao instance;

	private AsyncAttributeDao impl = (AsyncAttributeDao) GWT.create(AttributeDaoImpl.class);
	
	private AttributeDao() {

	}

	public static AttributeDao getInstance() {
		if (instance == null) {
			instance = new AttributeDao();
		}
		return instance;
	}

	public void delete(Attribute attribute, AsyncCallback<?> callback) {
		impl.delete(attribute, callback);
	}

	public void getAll(AsyncCallback<Collection<Attribute>> callback) {
		impl.getAll(callback);
	}

	public void getById(Long id, AsyncCallback<Attribute> callback) {
		impl.getById(id, callback);
	}

	public void save(Attribute attribute, AsyncCallback<?> callback) {
		impl.save(attribute, callback);
	}

}
