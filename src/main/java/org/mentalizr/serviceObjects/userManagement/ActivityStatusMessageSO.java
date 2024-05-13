package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;
import java.util.UUID;

@XmlRootElement
public class ActivityStatusMessageSO {

    public static final String ID = "id";
    public static final String TIMESTAMP = "timestamp";
    public static final String USER_ID = "userid";
    public static final String REST_ID = "restid";
    public static final String ROLE = "role";
    public static final String MESSAGE = "message";

    private String id;
    private Long timestamp;
    private String userId;
    private String restId;
    private String role;
    private String message;

    public ActivityStatusMessageSO() {
        this.id = UUID.randomUUID().toString();
        this.timestamp = 0L;
        this.userId = "";
        this.restId = "";
        this.role = "";
        this.message = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
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

    @Override
    public String toString() {
        if (this.message.isEmpty()) {
            return String.format("%s _ %s", this.userId, this.restId.replace("/","-"));
        }
        return String.format("%s _ %s _ %s", this.userId, this.restId.replace("/","-"), this.message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityStatusMessageSO that = (ActivityStatusMessageSO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
