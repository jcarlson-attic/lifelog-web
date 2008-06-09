package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.EntryType;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcEntryTypeDao;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcEntryTypeDaoAsync;

public class RpcEntryTypeDaoImpl extends EntryTypeDaoImpl {

	private RpcEntryTypeDaoAsync service = (RpcEntryTypeDaoAsync) GWT
			.create(RpcEntryTypeDao.class);

	@Override
	public void delete(EntryType entryType, AsyncCallback<?> callback) {
		service.delete(entryType, callback);
	}

	@Override
	public void getAll(AsyncCallback<Collection<EntryType>> callback) {
		service.getAll(callback);
	}

	@Override
	public void getById(Long id, AsyncCallback<EntryType> callback) {
		service.getById(id, callback);
	}

	@Override
	public void save(EntryType entryType, AsyncCallback<?> callback) {
		service.save(entryType, callback);
	}

}
