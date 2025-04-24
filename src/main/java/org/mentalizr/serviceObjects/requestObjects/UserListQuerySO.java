package org.mentalizr.serviceObjects.requestObjects;

public class UserListQuerySO {

    private String project;
    private String program;

    public UserListQuerySO() {
        this.project = null;
        this.program = null;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public boolean hasProject() {
        return this.project != null;
    }

    public boolean hasProgram() {
        return this.program != null;
    }

    @Override
    public String toString() {
        return "UserListQuerySO{" +
                "projectName='" + project + '\'' +
                ", programName='" + program + '\'' +
                '}';
    }

}
