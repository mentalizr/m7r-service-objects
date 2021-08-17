package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PatientMessageSO {

    private PatientMessagePlainSO patientMessagePlainSO;
    private PatientMessageExerciseSO patientMessageExerciseSO;
    private PatientMessageFeedbackSO patientMessageFeedbackSO;

    public PatientMessagePlainSO getPatientMessagePlainSO() {
        return patientMessagePlainSO;
    }

    public void setPatientMessagePlainSO(PatientMessagePlainSO patientMessagePlainSO) {
        this.patientMessagePlainSO = patientMessagePlainSO;
    }

    public PatientMessageExerciseSO getPatientMessageExerciseSO() {
        return patientMessageExerciseSO;
    }

    public void setPatientMessageExerciseSO(PatientMessageExerciseSO patientMessageExerciseSO) {
        this.patientMessageExerciseSO = patientMessageExerciseSO;
    }

    public PatientMessageFeedbackSO getPatientMessageFeedbackSO() {
        return patientMessageFeedbackSO;
    }

    public void setPatientMessageFeedbackSO(PatientMessageFeedbackSO patientMessageFeedbackSO) {
        this.patientMessageFeedbackSO = patientMessageFeedbackSO;
    }

}
