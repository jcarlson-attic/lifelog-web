package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Entry;
import com.methodknowledgy.lifelog.web.client.remote.EntryDaoAsync;

public class RpcEntryDaoImpl implements EntryDaoAsync {

	private RpcEntryDaoAsync service = (RpcEntryDaoAsync) GWT
			.create(RpcEntryDao.class);

	public void delete(Entry entry, AsyncCallback<?> callback) {
		service.delete(entry, callback);
	}

	public void getAll(AsyncCallback<Collection<Entry>> callback) {
		service.getAll(callback);
	}

	public void getById(Long id, AsyncCallback<Entry> callback) {
		service.getById(id, callback);
	}

	public void save(Entry entry, AsyncCallback<?> callback) {
		service.save(entry, callback);
	}

}
