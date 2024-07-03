package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProjectSO {

    private String projectId;
    private String label;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
