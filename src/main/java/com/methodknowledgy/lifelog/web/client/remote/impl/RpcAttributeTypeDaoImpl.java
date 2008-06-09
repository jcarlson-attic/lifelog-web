package com.methodknowledgy.lifelog.web.client.remote.impl;

import java.util.Collection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.methodknowledgy.lifelog.commons.domain.AttributeType;
import com.methodknowledgy.lifelog.web.client.remote.AttributeTypeDaoAsync;

public class RpcAttributeTypeDaoImpl implements AttributeTypeDaoAsync {

    private RpcAttributeTypeDaoAsync service = (RpcAttributeTypeDaoAsync) GWT
            .create(RpcAttributeTypeDao.class);

    public void delete(AttributeType attributeType, AsyncCallback<?> callback) {
        service.delete(attributeType, callback);
    }

    public void getAll(AsyncCallback<Collection<AttributeType>> callback) {
        service.getAll(callback);
    }

    public void getById(Long id, AsyncCallback<AttributeType> callback) {
        service.getById(id, callback);
    }

    public void save(AttributeType attributeType, AsyncCallback<?> callback) {
        service.save(attributeType, callback);
    }

}
