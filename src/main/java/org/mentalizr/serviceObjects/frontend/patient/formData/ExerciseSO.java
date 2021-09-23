package org.mentalizr.serviceObjects.frontend.patient.formData;

public class ExerciseSO {

    public static final String SENT = "sent";
    public static final String LAST_MODIFIED_TIMESTAMP = "lastModifiedTimestamp";
    public static final String SEEN_BY_THERAPIST = "seenByTherapist";
    public static final String SEEN_BY_THERAPIST_TIMESTAMP = "seenByTherapistTimestamp";

    private boolean sent;
    private String lastModifiedTimestamp;
    private boolean seenByTherapist;
    private String seenByTherapistTimestamp;

    public ExerciseSO() {
    }

    public ExerciseSO(boolean sent, String lastModifiedTimestamp, boolean seenByTherapist, String seenByTherapistTimestamp) {
        this.sent = sent;
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        this.seenByTherapist = seenByTherapist;
        this.seenByTherapistTimestamp = seenByTherapistTimestamp;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public String getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    public void setLastModifiedTimestamp(String lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public boolean isSeenByTherapist() {
        return seenByTherapist;
    }

    public void setSeenByTherapist(boolean seenByTherapist) {
        this.seenByTherapist = seenByTherapist;
    }

    public String getSeenByTherapistTimestamp() {
        return seenByTherapistTimestamp;
    }

    public void setSeenByTherapistTimestamp(String seenByTherapistTimestamp) {
        this.seenByTherapistTimestamp = seenByTherapistTimestamp;
    }
}
