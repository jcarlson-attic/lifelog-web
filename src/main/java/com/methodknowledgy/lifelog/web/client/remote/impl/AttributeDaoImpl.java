package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Attribute;
import com.methodknowledgy.lifelog.web.client.remote.AsyncAttributeDao;

public class AttributeDaoImpl implements AsyncAttributeDao {

	public void delete(Attribute attribute, AsyncCallback<?> callback) {
		puke();
	}

	public void getAll(AsyncCallback<Collection<Attribute>> callback) {
		puke();
	}

	public void getById(Long id, AsyncCallback<Attribute> callback) {
		puke();
	}

	public void save(Attribute attribute, AsyncCallback<?> callback) {
		puke();
	}

	private void puke() {
		throw new UnsupportedOperationException(
				getClass()
						+ " cannot be used directly. Implementation must be provided by GWT.create().");
	}

}
