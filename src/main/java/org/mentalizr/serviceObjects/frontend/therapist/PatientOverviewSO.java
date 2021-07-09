package org.mentalizr.serviceObjects.frontend.therapist;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientOverviewSO {

    private String userId;
    private String name;
    private boolean hasUpdate;
    private String overviewMessage;
    private String lastActiveDate;
    private boolean hasReceiveStatus;
    private boolean isReceived;

    public PatientOverviewSO() {
    }

    public PatientOverviewSO(String userId, String name, boolean hasUpdate, String overviewMessage, String lastActiveDate, boolean isReceived) {
        this.userId = userId;
        this.hasUpdate = hasUpdate;
        this.name = name;
        this.overviewMessage = overviewMessage;
        this.lastActiveDate = lastActiveDate;
        this.hasReceiveStatus = true;
        this.isReceived = isReceived;
    }

    public PatientOverviewSO(String userId, String name, boolean hasUpdate, String overviewMessage, String lastActiveDate) {
        this.userId = userId;
        this.hasUpdate = hasUpdate;
        this.name = name;
        this.overviewMessage = overviewMessage;
        this.lastActiveDate = lastActiveDate;
        this.hasReceiveStatus = false;
    }

    public boolean isHasUpdate() {
        return hasUpdate;
    }

    public void setHasUpdate(boolean hasUpdate) {
        this.hasUpdate = hasUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
