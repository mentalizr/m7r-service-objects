package org.mentalizr.serviceObjects.backup;

import org.mentalizr.serviceObjects.frontend.patient.PatientStatusSO;
import org.mentalizr.serviceObjects.frontend.patient.formData.FormDataSO;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class PatientStatusCollectionSO {

    private List<PatientStatusSO> collection;

    public PatientStatusCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<PatientStatusSO> getCollection() {
        return collection;
    }

    public void setCollection(List<PatientStatusSO> collection) {
        this.collection = collection;
    }

}
