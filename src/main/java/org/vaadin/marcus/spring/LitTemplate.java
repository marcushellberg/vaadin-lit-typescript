package org.vaadin.marcus.spring;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("lit-template")
@JsModule("./src/lit-template.ts")
public class LitTemplate extends Component {


  public LitTemplate() {
    getElement().addPropertyChangeListener("name", "name-changed", e -> {
      System.out.println(getElement().getProperty("name"));
    });
  }

  public void setName(String name) {
    getElement().setProperty("name", name);
  }

  public String getName() {
    return getElement().getProperty("name");
  }
}
