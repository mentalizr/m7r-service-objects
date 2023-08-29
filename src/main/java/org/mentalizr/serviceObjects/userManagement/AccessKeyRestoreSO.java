package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AccessKeyRestoreSO {

    private String userId;
    private boolean active;
    private Long creation;
    private Long firstActive;
    private Long lastActive;
    private String accessKey;
    private String programId;
    private String therapistId;

    public AccessKeyRestoreSO() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getCreation() {
        return creation;
    }

    public void setCreation(Long creation) {
        this.creation = creation;
    }

    public Long getFirstActive() {
        return firstActive;
    }

    public void setFirstActive(Long firstActive) {
        this.firstActive = firstActive;
    }

    public Long getLastActive() {
        return lastActive;
    }

    public void setLastActive(Long lastActive) {
        this.lastActive = lastActive;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }
}
