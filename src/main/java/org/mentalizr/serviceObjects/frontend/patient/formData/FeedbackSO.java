package org.mentalizr.serviceObjects.frontend.patient.formData;

public class FeedbackSO {

    public static final String TEXT = "text";
    public static final String CREATED_TIMESTAMP = "createdTimestamp";
    public static final String THERAPIST_ID = "therapistId";
    public static final String SEEN_BY_PATIENT = "seenByPatient";
    public static final String SEEN_BY_PATIENT_TIMESTAMP = "seenByPatientTimestamp";

    private String text;
    private String createdTimestamp;
    private String therapistId;
    private boolean seenByPatient;
    private String seenByPatientTimestamp;

    public FeedbackSO() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getTherapistId() {
        return therapistId;
    }

    public void setTherapistId(String therapistId) {
        this.therapistId = therapistId;
    }

    public boolean isSeenByPatient() {
        return seenByPatient;
    }

    public void setSeenByPatient(boolean seenByPatient) {
        this.seenByPatient = seenByPatient;
    }

    public String getSeenByPatientTimestamp() {
        return seenByPatientTimestamp;
    }

    public void setSeenByPatientTimestamp(String seenByPatientTimestamp) {
        this.seenByPatientTimestamp = seenByPatientTimestamp;
    }
}
