package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.Entry;

public interface EntryDaoAsync {

	void getAll(AsyncCallback<Collection<Entry>> callback);
	
	void getById(Long id, AsyncCallback<Entry> callback);
	
	void save(Entry entry, AsyncCallback<?> callback);
	
	void delete(Entry entry, AsyncCallback<?> callback);
	
}
