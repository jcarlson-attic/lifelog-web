package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Entry;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcEntryDao;
import com.methodknowledgy.lifelog.web.client.remote.rpc.RpcEntryDaoAsync;

public class RpcEntryDaoImpl extends EntryDaoImpl {

	private RpcEntryDaoAsync service = (RpcEntryDaoAsync) GWT
			.create(RpcEntryDao.class);

	@Override
	public void delete(Entry entry, AsyncCallback<?> callback) {
		service.delete(entry, callback);
	}

	@Override
	public void getAll(AsyncCallback<Collection<Entry>> callback) {
		service.getAll(callback);
	}

	@Override
	public void getById(Long id, AsyncCallback<Entry> callback) {
		service.getById(id, callback);
	}

	@Override
	public void save(Entry entry, AsyncCallback<?> callback) {
		service.save(entry, callback);
	}

}
