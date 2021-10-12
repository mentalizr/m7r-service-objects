package org.mentalizr.serviceObjects.userManagement;

import de.arthurpicht.utils.core.strings.Strings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TherapistRestoreSO {

    private String userId;
    private boolean active;
    private String firstActive;
    private String lastActive;
    private String username;
    private String passwordHash;
    private String email;
    private String title;
    private String firstname;
    private String lastname;
    private int gender;

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

    public String getFirstActive() {
        return firstActive;
    }

    public void setFirstActive(String firstActive) {
        this.firstActive = firstActive;
    }

    public String getLastActive() {
        return lastActive;
    }

    public void setLastActive(String lastActive) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
