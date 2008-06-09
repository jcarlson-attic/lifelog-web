package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Attribute;

public interface AttributeDaoAsync {

	void getAll(AsyncCallback<Collection<Attribute>> callback);
	
	void getById(Long id, AsyncCallback<Attribute> callback);
	
	void save(Attribute attribute, AsyncCallback<?> callback);
	
	void delete(Attribute attribute, AsyncCallback<?> callback);
	
}
