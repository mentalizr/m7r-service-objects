package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class TherapistRestoreCollectionSO {

    private List<TherapistRestoreSO> collection;

    public TherapistRestoreCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<TherapistRestoreSO> getCollection() {
        return collection;
    }

    public void setCollection(List<TherapistRestoreSO> collection) {
        this.collection = collection;
    }
}
