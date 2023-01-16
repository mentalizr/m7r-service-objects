package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PolicySO {

    private String userId;
    private String version;
    private Long consent;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getConsent() {
        return consent;
    }

    public void setConsent(Long consent) {
        this.consent = consent;
    }
}
