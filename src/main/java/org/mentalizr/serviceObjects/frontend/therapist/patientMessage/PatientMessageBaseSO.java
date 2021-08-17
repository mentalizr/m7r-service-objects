package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

public class PatientMessageBaseSO {

    protected String senderId;
    protected String date;
    protected boolean isNew;
    protected String text;

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
