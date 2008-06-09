package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.AttributeType;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcAttributeTypeDao;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcAttributeTypeDaoAsync;

public class RpcAttributeTypeDaoImpl extends AttributeTypeDaoImpl {

	private RpcAttributeTypeDaoAsync service = (RpcAttributeTypeDaoAsync) GWT
			.create(RpcAttributeTypeDao.class);

	@Override
	public void delete(AttributeType attributeType, AsyncCallback<?> callback) {
		service.delete(attributeType, callback);
	}

	@Override
	public void getAll(AsyncCallback<Collection<AttributeType>> callback) {
		service.getAll(callback);
	}

	@Override
	public void getById(Long id, AsyncCallback<AttributeType> callback) {
		service.getById(id, callback);
	}

	@Override
	public void save(AttributeType attributeType, AsyncCallback<?> callback) {
		service.save(attributeType, callback);
	}

}
