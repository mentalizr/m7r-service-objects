package org.mentalizr.serviceObjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SessionStatus {

    private boolean valid;
    private String userRole;
    private String sessionId;

    public SessionStatus() {
    }

    public SessionStatus(boolean valid, String userRole, String sessionId) {
        this.valid = valid;
        this.userRole = userRole;
        this.sessionId = sessionId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
