package com.methodknowledgy.lifelog.web.client.remote;

import com.google.gwt.core.client.GWT;

public class DaoFactory {

    private static AttributeDaoAsync attributeDao;
    private static AttributeTypeDaoAsync attributeTypeDao = (AttributeTypeDaoAsync) GWT.create(AttributeTypeDaoAsync.class);
    private static EntryDaoAsync entryDao = (EntryDaoAsync) GWT.create(EntryDaoAsync.class);
    private static EntryTypeDaoAsync entryTypeDao = (EntryTypeDaoAsync) GWT.create(EntryTypeDaoAsync.class);

    private DaoFactory() {
    }

    public static AttributeDaoAsync getAttributeDao() {
        if (attributeDao == null) {
            attributeDao = (AttributeDaoAsync) GWT.create(AttributeDaoAsync.class);
        }
        return attributeDao;
    }

    public static AttributeTypeDaoAsync getAttributeTypeDao() {
        if (attributeTypeDao == null) {
            attributeTypeDao = (AttributeTypeDaoAsync) GWT.create(AttributeTypeDaoAsync.class);
        }
        return attributeTypeDao;
    }

    public static EntryDaoAsync getEntryDao() {
        if (entryDao == null) {
            entryDao = (EntryDaoAsync) GWT.create(EntryDaoAsync.class);
        }
        return entryDao;
    }

    public static EntryTypeDaoAsync getEntryTypeDao() {
        if (entryTypeDao == null) {
            entryTypeDao = (EntryTypeDaoAsync) GWT.create(EntryTypeDaoAsync.class);
        }
        return entryTypeDao;
    }

}
