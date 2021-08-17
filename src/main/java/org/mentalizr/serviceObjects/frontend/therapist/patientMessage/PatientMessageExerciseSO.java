package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlTransient
public class PatientMessageExerciseSO extends PatientMessageBaseSO {

    private String exerciseId;
    private boolean hasFeedback;

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public boolean isHasFeedback() {
        return hasFeedback;
    }

    public void setHasFeedback(boolean hasFeedback) {
        this.hasFeedback = hasFeedback;
    }
}
