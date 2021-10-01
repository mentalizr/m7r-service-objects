package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StepSO {

    private String id;
    private String name;
    private boolean exercise;
    private boolean feedback;
    private boolean accessible;

    public StepSO() {
    }

    public StepSO(String id, String name, boolean exercise, boolean feedback, boolean accessible) {
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

    public boolean isExercise() {
        return exercise;
    }

    public void setExercise(boolean exercise) {
        this.exercise = exercise;
    }

    public boolean isFeedback() {
        return feedback;
    }

    public void setFeedback(boolean feedback) {
        this.feedback = feedback;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

}
