package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

public class PatientMessageSOs {

    public static boolean hasPatientMessagePlainSO(PatientMessageSO patientMessageSO) {
        return patientMessageSO.getPatientMessagePlain() != null;
    }

    public static boolean hasPatientMessageExerciseSO(PatientMessageSO patientMessageSO) {
        return patientMessageSO.getPatientMessageExercise() != null;
    }

    public static boolean hasPatientMessageFeedbackSO(PatientMessageSO patientMessageSO) {
        return patientMessageSO.getPatientMessageFeedback() != null;
    }

    public static long getTimestamp(PatientMessageSO patientMessageSO) {
        if (hasPatientMessagePlainSO(patientMessageSO))
            return patientMessageSO.getPatientMessagePlain().getTimestamp();
        if (hasPatientMessageExerciseSO(patientMessageSO))
            return patientMessageSO.getPatientMessageExercise().getTimestamp();
        if (hasPatientMessageFeedbackSO(patientMessageSO))
            return patientMessageSO.getPatientMessageFeedback().getTimestamp();
        throw new IllegalStateException("PatientMessageSO must contain exactly one of *Plain*, *Message* or *Feedback*");
    }

}
