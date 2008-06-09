package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.EntryType;
import com.methodknowledgy.lifelog.web.client.remote.impl.EntryTypeDaoImpl;

public class EntryTypeDao implements AsyncEntryTypeDao {

	private static EntryTypeDao instance;

	private AsyncEntryTypeDao impl = (AsyncEntryTypeDao) GWT
			.create(EntryTypeDaoImpl.class);

	private EntryTypeDao() {
		
	}
	
	public static EntryTypeDao getInstance() {
		if (instance == null) {
			instance = new EntryTypeDao();
		}
		return instance;
	}
	
	public void delete(EntryType entryType, AsyncCallback<?> callback) {
		impl.delete(entryType, callback);
	}

	public void getAll(AsyncCallback<Collection<EntryType>> callback) {
		impl.getAll(callback);
	}

	public void getById(Long id, AsyncCallback<EntryType> callback) {
		impl.getById(id, callback);
	}

	public void save(EntryType entryType, AsyncCallback<?> callback) {
		impl.save(entryType, callback);
	}

}
