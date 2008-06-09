package com.methodknowledgy.lifelog.web.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class LifeLog implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().add(new HTML("<h1>Hello, world!</h1>"));
        
    }

}
