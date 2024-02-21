package org.mentalizr.serviceObjects.frontend.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ActivityStatusMessageSO {

    public static final String TIMESTAMP = "timestamp";
    public static final String USER_ID = "userid";
    public static final String REST_ID = "restid";
    public static final String ROLE = "role";
    public static final String MESSAGE = "message";

    private String timestamp;
    private String userId;
    private String restId;
    private String role;
    private String message;

    public ActivityStatusMessageSO() {
        this.timestamp = "";
        this.userId = "";
        this.restId = "";
        this.role = "";
        this.message = "";
    }

    public ActivityStatusMessageSO(String timestamp, String userId,
                                   String restId, String role, String message) {
        this.timestamp = timestamp;
        this.userId = userId;
        this.restId = restId;
        this.role = role;
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRestId() {
        return restId;
    }

    public void setRestId(String restId) {
        this.restId = restId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
