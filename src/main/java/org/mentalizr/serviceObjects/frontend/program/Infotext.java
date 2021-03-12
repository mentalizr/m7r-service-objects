package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Infotext {

    private String id;
    private String name;

    public Infotext() {}

    public Infotext(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
