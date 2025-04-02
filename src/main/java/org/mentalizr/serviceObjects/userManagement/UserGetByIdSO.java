package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserGetByIdSO {

    private String id;

    public UserGetByIdSO() {}

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
