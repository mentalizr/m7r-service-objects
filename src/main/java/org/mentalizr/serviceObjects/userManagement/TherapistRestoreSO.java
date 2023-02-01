package org.mentalizr.serviceObjects.userManagement;

import de.arthurpicht.utils.core.strings.Strings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TherapistRestoreSO {

    private String userId;
    private boolean active;
    private Long firstActive;
    private Long lastActive;
    private String username;
    private String passwordHash;
    private String email;
    private String title;
    private String firstname;
    private String lastname;
    private int gender;
    private boolean secondFA;
    private Long emailConfirmation;
    private String emailConfToken;
    private String emailConfCode;
    private boolean renewPasswordRequired;

    public TherapistRestoreSO() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean hasUuid() {
        return Strings.isNotNullAndNotEmpty(this.userId);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getFirstActive() {
        return this.firstActive;
    }

    public void setFirstActive(Long firstActive) {
        this.firstActive = firstActive;
    }

    public Long getLastActive() {
        return this.lastActive;
    }

    public void setLastActive(Long lastActive) {
        this.lastActive = lastActive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean hasPasswordHash() {
        return Strings.isNotNullAndNotEmpty(this.passwordHash);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isSecondFA() {
        return secondFA;
    }

    public void setSecondFA(boolean secondFA) {
        this.secondFA = secondFA;
    }

    public Long getEmailConfirmation() {
        return emailConfirmation;
    }

    public void setEmailConfirmation(Long emailConfirmation) {
        this.emailConfirmation = emailConfirmation;
    }

    public String getEmailConfToken() {
        return emailConfToken;
    }

    public void setEmailConfToken(String emailConfToken) {
        this.emailConfToken = emailConfToken;
    }

    public String getEmailConfCode() {
        return emailConfCode;
    }

    public void setEmailConfCode(String emailConfCode) {
        this.emailConfCode = emailConfCode;
    }

    public boolean isRenewPasswordRequired() {
        return renewPasswordRequired;
    }

    public void setRenewPasswordRequired(boolean renewPasswordRequired) {
        this.renewPasswordRequired = renewPasswordRequired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
