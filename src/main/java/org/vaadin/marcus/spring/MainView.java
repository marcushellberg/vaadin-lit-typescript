package org.vaadin.marcus.spring;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        LitTemplate litTemplate = new LitTemplate();
        litTemplate.setName("Server");

        add(litTemplate);
    }

}
