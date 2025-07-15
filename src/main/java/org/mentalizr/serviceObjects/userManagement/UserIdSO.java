package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserIdSO {

    private String id;

    public UserIdSO() {}

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
