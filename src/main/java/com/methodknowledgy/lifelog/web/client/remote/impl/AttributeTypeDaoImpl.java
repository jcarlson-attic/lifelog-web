package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.AttributeType;
import com.methodknowledgy.lifelog.web.client.remote.AsyncAttributeTypeDao;

public class AttributeTypeDaoImpl implements AsyncAttributeTypeDao {

	public void delete(AttributeType attributeType, AsyncCallback<?> callback) {
		puke();
	}

	public void getAll(AsyncCallback<Collection<AttributeType>> callback) {
		puke();
	}

	public void getById(Long id, AsyncCallback<AttributeType> callback) {
		puke();
	}

	public void save(AttributeType attributeType, AsyncCallback<?> callback) {
		puke();
	}

	private void puke() {
		throw new UnsupportedOperationException(
				getClass()
						+ " cannot be used directly. Implementation must be provided by GWT.create().");
	}

}
