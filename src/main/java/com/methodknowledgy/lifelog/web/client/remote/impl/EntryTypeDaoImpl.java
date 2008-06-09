package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.EntryType;
import com.methodknowledgy.lifelog.web.client.remote.AsyncEntryTypeDao;

public class EntryTypeDaoImpl implements AsyncEntryTypeDao {

	public void delete(EntryType entryType, AsyncCallback<?> callback) {
		puke();
	}

	public void getAll(AsyncCallback<Collection<EntryType>> callback) {
		puke();
	}

	public void getById(Long id, AsyncCallback<EntryType> callback) {
		puke();
	}

	public void save(EntryType entryType, AsyncCallback<?> callback) {
		puke();
	}

	private void puke() {
		throw new UnsupportedOperationException(
				getClass()
						+ " cannot be used directly. Implementation must be provided by GWT.create().");
	}

}
