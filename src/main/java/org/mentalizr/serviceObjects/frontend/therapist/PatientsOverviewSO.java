package org.mentalizr.serviceObjects.frontend.therapist;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class PatientsOverviewSO {

    private List<PatientOverviewSO> patientOverviewSOList;

    public PatientsOverviewSO(List<PatientOverviewSO> patientOverviewSOList) {
        this.patientOverviewSOList = patientOverviewSOList;
    }

    public List<PatientOverviewSO> getPatientOverviews() {
        return patientOverviewSOList;
    }

    public void setPatientOverviews(List<PatientOverviewSO> patientOverviewSOList) {
        this.patientOverviewSOList = patientOverviewSOList;
    }
}
