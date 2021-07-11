package org.mentalizr.serviceObjects.frontend.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserSO {

    private String userId;
    private String displayName;
    private int gender;

    public UserSO() {}

    public UserSO(String userId, String displayName, int gender) {
        this.userId = userId;
        this.displayName = displayName;
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
