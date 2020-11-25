package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class PatientRestoreCollectionSO {

    private List<PatientRestoreSO> collection;

    public PatientRestoreCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<PatientRestoreSO> getCollection() {
        return collection;
    }

    public void setCollection(List<PatientRestoreSO> collection) {
        this.collection = collection;
    }
}
