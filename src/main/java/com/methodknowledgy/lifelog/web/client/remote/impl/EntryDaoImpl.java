package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Entry;
import com.methodknowledgy.lifelog.web.client.remote.AsyncEntryDao;

public class EntryDaoImpl implements AsyncEntryDao {

	public void delete(Entry entry, AsyncCallback<?> callback) {
		puke();
	}

	public void getAll(AsyncCallback<Collection<Entry>> callback) {
		puke();
	}

	public void getById(Long id, AsyncCallback<Entry> callback) {
		puke();
	}

	public void save(Entry entry, AsyncCallback<?> callback) {
		puke();
	}

	private void puke() {
		throw new UnsupportedOperationException(
				getClass()
						+ " cannot be used directly. Implementation must be provided by GWT.create().");
	}

}
