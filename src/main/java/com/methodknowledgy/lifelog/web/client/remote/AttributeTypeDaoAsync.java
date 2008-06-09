package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.AttributeType;

public interface AttributeTypeDaoAsync {

	void getAll(AsyncCallback<Collection<AttributeType>> callback);
	
	void getById(Long id, AsyncCallback<AttributeType> callback);
	
	void save(AttributeType attributeType, AsyncCallback<?> callback);
	
	void delete(AttributeType attributeType, AsyncCallback<?> callback);
	
}
