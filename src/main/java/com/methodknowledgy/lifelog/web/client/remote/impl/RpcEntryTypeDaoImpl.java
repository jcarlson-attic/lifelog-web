package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.EntryType;
import com.methodknowledgy.lifelog.web.client.remote.EntryTypeDaoAsync;

public class RpcEntryTypeDaoImpl implements EntryTypeDaoAsync {

	private RpcEntryTypeDaoAsync service = (RpcEntryTypeDaoAsync) GWT
			.create(RpcEntryTypeDao.class);

	public void delete(EntryType entryType, AsyncCallback<?> callback) {
		service.delete(entryType, callback);
	}

	public void getAll(AsyncCallback<Collection<EntryType>> callback) {
		service.getAll(callback);
	}

	public void getById(Long id, AsyncCallback<EntryType> callback) {
		service.getById(id, callback);
	}

	public void save(EntryType entryType, AsyncCallback<?> callback) {
		service.save(entryType, callback);
	}

}
