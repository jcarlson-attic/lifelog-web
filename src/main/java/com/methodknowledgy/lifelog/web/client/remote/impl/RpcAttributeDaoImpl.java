package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Attribute;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcAttributeDao;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcAttributeDaoAsync;

public class RpcAttributeDaoImpl extends AttributeDaoImpl {

	private RpcAttributeDaoAsync service = (RpcAttributeDaoAsync) GWT
			.create(RpcAttributeDao.class);

	@Override
	public void delete(Attribute attribute, AsyncCallback<?> callback) {
		service.delete(attribute, callback);
	}

	@Override
	public void getAll(AsyncCallback<Collection<Attribute>> callback) {
		service.getAll(callback);
	}

	@Override
	public void getById(Long id, AsyncCallback<Attribute> callback) {
		service.getById(id, callback);
	}

	@Override
	public void save(Attribute attribute, AsyncCallback<?> callback) {
		service.save(attribute, callback);
	}

}
