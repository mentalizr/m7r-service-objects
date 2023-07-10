package org.mentalizr.serviceObjects.frontend.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ChangePasswordSO {

    private String password;

    public ChangePasswordSO() {}

    public ChangePasswordSO(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
