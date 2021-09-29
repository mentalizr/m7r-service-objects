package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StepSO {

    private String id;
    private String name;
    private boolean feedback;

    public StepSO() {
    }

    public StepSO(String id, String name, boolean feedback) {
        this.id = id;
        this.name = name;
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFeedback() {
        return feedback;
    }

    public void setFeedback(boolean feedback) {
        this.feedback = feedback;
    }
}
