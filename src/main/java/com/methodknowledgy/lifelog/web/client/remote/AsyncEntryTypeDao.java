package com.methodknowledgy.lifelog.web.client.remote;

import java.util.Collection;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.EntryType;

public interface AsyncEntryTypeDao {

	void getAll(AsyncCallback<Collection<EntryType>> callback);
	
	void getById(Long id, AsyncCallback<EntryType> callback);
	
	void save(EntryType entryType, AsyncCallback<?> callback);
	
	void delete(EntryType entryType, AsyncCallback<?> callback);
	
}
