package com.methodknowledgy.lifelog.web.client.remote.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.methodknowledgy.lifelog.commons.dao.AttributeTypeDao;

@RemoteServiceRelativePath("AttributeTypeDao.rpc")
public interface RpcAttributeTypeDao extends RemoteService, AttributeTypeDao {

}
