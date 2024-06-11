package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ActivityRecordCollectionSO {

    private List<ActivityRecordSO> collection;

    public ActivityRecordCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ActivityRecordSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ActivityRecordSO> collection) {
        this.collection = collection;
    }
}
