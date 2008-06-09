package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Entry;
import com.methodknowledgy.lifelog.web.client.remote.impl.EntryDaoImpl;

public class EntryDao implements AsyncEntryDao {

	private static EntryDao instance;

	private AsyncEntryDao impl = (AsyncEntryDao) GWT
			.create(EntryDaoImpl.class);

	private EntryDao() {

	}

	public static EntryDao getInstance() {
		if (instance == null) {
			instance = new EntryDao();
		}
		return instance;
	}

	public void delete(Entry entry, AsyncCallback<?> callback) {
		impl.delete(entry, callback);
	}

	public void getAll(AsyncCallback<Collection<Entry>> callback) {
		impl.getAll(callback);
	}

	public void getById(Long id, AsyncCallback<Entry> callback) {
		impl.getById(id, callback);
	}

	public void save(Entry entry, AsyncCallback<?> callback) {
		impl.save(entry, callback);
	}

}
