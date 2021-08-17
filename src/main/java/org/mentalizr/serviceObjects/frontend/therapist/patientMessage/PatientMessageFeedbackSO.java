package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlTransient
public class PatientMessageFeedbackSO extends PatientMessageBaseSO {

    private String exerciseId;

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }
}
