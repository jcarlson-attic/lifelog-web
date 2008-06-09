package com.methodknowledgy.lifelog.web.client.remote.impl;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.methodknowledgy.lifelog.commons.dao.AttributeDao;

@RemoteServiceRelativePath("AttributeDao.rpc")
public interface RpcAttributeDao extends RemoteService, AttributeDao {

}
