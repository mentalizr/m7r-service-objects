package org.mentalizr.serviceObjects.requestObjects;

public class UserListQuerySO {

    private String projectName;
    private String programName;

    public UserListQuerySO() {
        this.projectName = "";
        this.programName = "";
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public boolean isProject() {
        return !projectName.isBlank();
    }

    public boolean isProgram() {
        return !programName.isBlank();
    }

    @Override
    public String toString() {
        return "UserListQuerySOX{" +
                "projectName='" + projectName + '\'' +
                ", programName='" + programName + '\'' +
                '}';
    }

}
