package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientMessageSO {

    private PatientMessagePlainSO patientMessagePlainSO;
    private PatientMessageExerciseSO patientMessageExerciseSO;
    private PatientMessageFeedbackSO patientMessageFeedbackSO;

    public PatientMessagePlainSO getPatientMessagePlain() {
        return patientMessagePlainSO;
    }

    public void setPatientMessagePlain(PatientMessagePlainSO patientMessagePlainSO) {
        this.patientMessagePlainSO = patientMessagePlainSO;
    }

    public PatientMessageExerciseSO getPatientMessageExercise() {
        return patientMessageExerciseSO;
    }

    public void setPatientMessageExercise(PatientMessageExerciseSO patientMessageExerciseSO) {
        this.patientMessageExerciseSO = patientMessageExerciseSO;
    }

    public PatientMessageFeedbackSO getPatientMessageFeedback() {
        return patientMessageFeedbackSO;
    }

    public void setPatientMessageFeedback(PatientMessageFeedbackSO patientMessageFeedbackSO) {
        this.patientMessageFeedbackSO = patientMessageFeedbackSO;
    }

}
