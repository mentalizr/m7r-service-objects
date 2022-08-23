package org.mentalizr.serviceObjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SessionStatusSO {

    public static final String STATUS_VALID = "VALID";
    public static final String STATUS_INVALID = "INVALID";
    public static final String STATUS_INTERMEDIATE = "INTERMEDIATE";
    public static final String REQUIRE_POLICY_CONSENT = "POLICY_CONSENT";
    public static final String REQUIRE_RENEW_PASSWORD = "RENEW_PASSWORD";
    public static final String REQUIRE_EMAIL_CONFIRMATION = "EMAIL_CONFIRMATION";
    public static final String REQUIRE_2FA = "2FA";

    private String status;
    private String userRole;
    private String sessionId;
    private String require;

    public SessionStatusSO() {
    }

    public SessionStatusSO(String status, String userRole, String sessionId, String require) {
        this.status = status;
        this.userRole = userRole;
        this.sessionId = sessionId;
        this.require = require;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequire() {
        return this.require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

}
