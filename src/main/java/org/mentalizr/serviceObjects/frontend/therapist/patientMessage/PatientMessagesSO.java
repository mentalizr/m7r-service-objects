package org.mentalizr.serviceObjects.frontend.therapist.patientMessage;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class PatientMessagesSO {

    private String patientId;

    private List<PatientMessageSO> patientMessageSOList;

    public PatientMessagesSO(String patientId, List<PatientMessageSO> patientMessageSOList) {
        this.patientId = patientId;
        this.patientMessageSOList = patientMessageSOList;
    }

    public PatientMessagesSO() {
        this.patientMessageSOList = new ArrayList<>();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public List<PatientMessageSO> getPatientMessages() {
        return patientMessageSOList;
    }

    public void setPatientMessages(List<PatientMessageSO> patientMessageSOList) {
        this.patientMessageSOList = patientMessageSOList;
    }
}
