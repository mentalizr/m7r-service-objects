package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

public class PatientMessageBaseSO {

    protected String messageId;
    protected long timestamp;
    protected String senderId;
    protected String date;
    protected boolean isNew;
    protected boolean isReadByReceiver;
    protected String text;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

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

    public boolean isReadByReceiver() {
        return isReadByReceiver;
    }

    public void setReadByReceiver(boolean readByReceiver) {
        isReadByReceiver = readByReceiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
