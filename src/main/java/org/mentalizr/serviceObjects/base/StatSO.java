package org.mentalizr.serviceObjects.base;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatSO {

    private int nrOfUsers;
    private int nrOfUserLogin;
    private int nrOfUserAccessKeys;
    private int nrOfRolePatients;
    private int nrOfRoleAdmins;
    private int nrOfRoleTherapists;
    private long nrOfActivityRecords;
    private long nrOfFormDataDocuments;
    private long nrOfPatientStatusDocuments;
    private int nrOfUsersWithActivityRecords;
    private int nrOfUsersWithFormDataDocuments;
    private int nrOfUsersWithPatientStatusDocuments;
    private int nrOfProjects;
    private int nrOfPrograms;

    public StatSO() {
    }

    public int getNrOfUsers() {
        return nrOfUsers;
    }

    public void setNrOfUsers(int nrOfUsers) {
        this.nrOfUsers = nrOfUsers;
    }

    public int getNrOfUserLogin() {
        return nrOfUserLogin;
    }

    public void setNrOfUserLogin(int nrOfUserLogin) {
        this.nrOfUserLogin = nrOfUserLogin;
    }

    public int getNrOfUserAccessKeys() {
        return nrOfUserAccessKeys;
    }

    public void setNrOfUserAccessKeys(int nrOfUserAccessKeys) {
        this.nrOfUserAccessKeys = nrOfUserAccessKeys;
    }

    public int getNrOfRolePatients() {
        return nrOfRolePatients;
    }

    public void setNrOfRolePatients(int nrOfRolePatients) {
        this.nrOfRolePatients = nrOfRolePatients;
    }

    public int getNrOfRoleAdmins() {
        return nrOfRoleAdmins;
    }

    public void setNrOfRoleAdmins(int nrOfRoleAdmins) {
        this.nrOfRoleAdmins = nrOfRoleAdmins;
    }

    public int getNrOfRoleTherapists() {
        return nrOfRoleTherapists;
    }

    public void setNrOfRoleTherapists(int nrOfRoleTherapists) {
        this.nrOfRoleTherapists = nrOfRoleTherapists;
    }

    public long getNrOfActivityRecords() {
        return nrOfActivityRecords;
    }

    public void setNrOfActivityRecords(long nrOfActivityRecords) {
        this.nrOfActivityRecords = nrOfActivityRecords;
    }

    public long getNrOfFormDataDocuments() {
        return nrOfFormDataDocuments;
    }

    public void setNrOfFormDataDocuments(long nrOfFormDataDocuments) {
        this.nrOfFormDataDocuments = nrOfFormDataDocuments;
    }

    public long getNrOfPatientStatusDocuments() {
        return nrOfPatientStatusDocuments;
    }

    public void setNrOfPatientStatusDocuments(long nrOfPatientStatusDocuments) {
        this.nrOfPatientStatusDocuments = nrOfPatientStatusDocuments;
    }

    public int getNrOfUsersWithActivityRecords() {
        return nrOfUsersWithActivityRecords;
    }

    public void setNrOfUsersWithActivityRecords(int nrOfUsersWithActivityRecords) {
        this.nrOfUsersWithActivityRecords = nrOfUsersWithActivityRecords;
    }

    public int getNrOfUsersWithFormDataDocuments() {
        return nrOfUsersWithFormDataDocuments;
    }

    public void setNrOfUsersWithFormDataDocuments(int nrOfUsersWithFormDataDocuments) {
        this.nrOfUsersWithFormDataDocuments = nrOfUsersWithFormDataDocuments;
    }

    public int getNrOfUsersWithPatientStatusDocuments() {
        return nrOfUsersWithPatientStatusDocuments;
    }

    public void setNrOfUsersWithPatientStatusDocuments(int nrOfUsersWithPatientStatusDocuments) {
        this.nrOfUsersWithPatientStatusDocuments = nrOfUsersWithPatientStatusDocuments;
    }

    public int getNrOfProjects() {
        return nrOfProjects;
    }

    public void setNrOfProjects(int nrOfProjects) {
        this.nrOfProjects = nrOfProjects;
    }

    public int getNrOfPrograms() {
        return nrOfPrograms;
    }

    public void setNrOfPrograms(int nrOfPrograms) {
        this.nrOfPrograms = nrOfPrograms;
    }

    @Override
    public String toString() {
        return "ConsistencyCheckResultSO{" +
                ", nrOfUsers=" + nrOfUsers +
                ", nrOfUserLogin=" + nrOfUserLogin +
                ", nrOfUserAccessKeys=" + nrOfUserAccessKeys +
                ", nrOfRolePatients=" + nrOfRolePatients +
                ", nrOfRoleAdmins=" + nrOfRoleAdmins +
                ", nrOfRoleTherapists=" + nrOfRoleTherapists +
                ", nrOfActivityRecords=" + nrOfActivityRecords +
                ", nrOfFormDataDocuments=" + nrOfFormDataDocuments +
                ", nrOfPatientStatusDocuments=" + nrOfPatientStatusDocuments +
                ",  nrOfUsersWithActivityRecords=" + nrOfUsersWithActivityRecords +
                ", nrOfUsersWithFormDataDocuments=" + nrOfUsersWithFormDataDocuments +
                ", nrOfUsersWithPatientStatusDocuments=" + nrOfUsersWithPatientStatusDocuments +
                ", nrOfProjects=" + nrOfProjects +
                ", nrOfPrograms=" + nrOfPrograms +
                '}';
    }

}
