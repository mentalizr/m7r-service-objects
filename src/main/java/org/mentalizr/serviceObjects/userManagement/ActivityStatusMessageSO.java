package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ActivityStatusMessageSO {

    public static final String TIMESTAMP = "timestamp";
    public static final String USER_ID = "userid";
    public static final String REST_ID = "restid";
    public static final String ROLE = "role";
    public static final String MESSAGE = "message";

    private Long timestampValue;
    private String userIdValue;
    private String restIdValue;
    private String roleValue;
    private String messageValue;

    public ActivityStatusMessageSO() {
        this.timestampValue = 0L;
        this.userIdValue = "";
        this.restIdValue = "";
        this.roleValue = "";
        this.messageValue = "";
    }

    public ActivityStatusMessageSO(Long timestamp, String userId,
                                   String restId, String role, String message) {
        this.timestampValue = timestamp;
        this.userIdValue = userId;
        this.restIdValue = restId;
        this.roleValue = role;
        this.messageValue = message;
    }

    public Long getTimestamp() {
        return timestampValue;
    }

    public void setTimestamp(long timestampValue) {
        this.timestampValue = timestampValue;
    }

    public String getUserId() {
        return userIdValue;
    }

    public void setUserId(String userIdValue) {
        this.userIdValue = userIdValue;
    }

    public String getRestId() {
        return restIdValue;
    }

    public void setRestId(String restIdValue) {
        this.restIdValue = restIdValue;
    }

    public String getRole() {
        return roleValue;
    }

    public void setRole(String roleValue) {
        this.roleValue = roleValue;
    }

    public String getMessage() {
        return messageValue;
    }

    public void setMessage(String messageValue) {
        this.messageValue = messageValue;
    }
}
