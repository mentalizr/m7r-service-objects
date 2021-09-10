package org.mentalizr.serviceObjects.userManagement;

import de.arthurpicht.utils.core.strings.Strings;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientAddSO {

    private String uuid;
    private boolean active;
    private String username;
    private String password;
    private String passwordHash;
    private String email;
    private String firstname;
    private String lastname;
    private int gender;
    private String programId;
    private boolean blocking;
    private String therapistId;

    public PatientAddSO() {}

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean hasUuid() {
        return Strings.isNotNullAndNotEmpty(this.uuid);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean hasPassword() {
        return Strings.isNotNullAndNotEmpty(this.password);
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

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }
}
