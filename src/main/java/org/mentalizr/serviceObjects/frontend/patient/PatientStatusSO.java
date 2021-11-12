package org.mentalizr.serviceObjects.frontend.patient;

public class PatientStatusSO {

    public static final String USER_ID = "userId";
    public static final String LAST_CONTENT_ID = "lastContentId";

    private String userId;
    private String lastContentId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastContentId() {
        return lastContentId;
    }

    public void setLastContentId(String lastContentId) {
        this.lastContentId = lastContentId;
    }
}
