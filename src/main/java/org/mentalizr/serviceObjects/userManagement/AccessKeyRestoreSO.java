package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

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
    private String projectId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessKeyRestoreSO that = (AccessKeyRestoreSO) o;
        return active == that.active && Objects.equals(userId, that.userId) && Objects.equals(creation, that.creation) && Objects.equals(firstActive, that.firstActive) && Objects.equals(lastActive, that.lastActive) && Objects.equals(accessKey, that.accessKey) && Objects.equals(programId, that.programId) && Objects.equals(therapistId, that.therapistId) && Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId);
    }

    @Override
    public String toString() {
        return "AccessKeyRestoreSO{" +
                "userId='" + userId + '\'' +
                ", active=" + active +
                ", creation=" + creation +
                ", firstActive=" + firstActive +
                ", lastActive=" + lastActive +
                ", accessKey='" + accessKey + '\'' +
                ", programId='" + programId + '\'' +
                ", therapistId='" + therapistId + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }

}
