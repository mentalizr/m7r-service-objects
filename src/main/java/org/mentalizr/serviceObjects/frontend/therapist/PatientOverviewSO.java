package org.mentalizr.serviceObjects.frontend.therapist;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientOverviewSO {

    private String userId;
    private String displayName;
    private String initials;
    private boolean hasUpdate;
    private String overviewMessage;
    private String lastActiveDate;
    private boolean hasReceiveStatus;
    private boolean isReceived;

    public PatientOverviewSO() {
    }

    public PatientOverviewSO(String userId, String displayName, String initials, boolean hasUpdate, String overviewMessage, String lastActiveDate, boolean isReceived) {
        this.userId = userId;
        this.displayName = displayName;
        this.initials = initials;
        this.hasUpdate = hasUpdate;
        this.overviewMessage = overviewMessage;
        this.lastActiveDate = lastActiveDate;
        this.hasReceiveStatus = true;
        this.isReceived = isReceived;
    }

    public PatientOverviewSO(String userId, String displayName, String initials, boolean hasUpdate, String overviewMessage, String lastActiveDate) {
        this.userId = userId;
        this.displayName = displayName;
        this.initials = initials;
        this.hasUpdate = hasUpdate;
        this.overviewMessage = overviewMessage;
        this.lastActiveDate = lastActiveDate;
        this.hasReceiveStatus = false;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public boolean isHasUpdate() {
        return hasUpdate;
    }

    public void setHasUpdate(boolean hasUpdate) {
        this.hasUpdate = hasUpdate;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getOverviewMessage() {
        return overviewMessage;
    }

    public void setOverviewMessage(String overviewMessage) {
        this.overviewMessage = overviewMessage;
    }

    public String getLastActiveDate() {
        return lastActiveDate;
    }

    public void setLastActiveDate(String lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }

    public boolean isHasReceiveStatus() {
        return hasReceiveStatus;
    }

    public void setHasReceiveStatus(boolean hasReceiveStatus) {
        this.hasReceiveStatus = hasReceiveStatus;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public void setReceived(boolean received) {
        isReceived = received;
    }
}
