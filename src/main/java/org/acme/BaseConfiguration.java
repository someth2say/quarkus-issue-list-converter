package org.acme;

import java.util.Collection;
import java.util.List;
import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties
public interface BaseConfiguration {
    public List<MyListElement> mylist(); // Replace by Collection and it works.

    public class MyListElement { 
        public String text;
        public MyListElement(){ } 
        public MyListElement(final String text){ this.text = text.toUpperCase(); }
    }
}
