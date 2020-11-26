package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AccessKeyCreateSO {

    private int nrOfKeys;
    private String startWith;
    private boolean active;
    private String programId;
    private String therapistId;

    public AccessKeyCreateSO() {}

    public int getNrOfKeys() {
        return nrOfKeys;
    }

    public void setNrOfKeys(int nrOfKeys) {
        this.nrOfKeys = nrOfKeys;
    }

    public String getStartWith() {
        return startWith;
    }

    public void setStartWith(String startWith) {
        this.startWith = startWith;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
