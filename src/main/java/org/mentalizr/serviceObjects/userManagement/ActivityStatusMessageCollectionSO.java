package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ActivityStatusMessageCollectionSO {

    private List<ActivityMessageSO> collection;

    public ActivityStatusMessageCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ActivityMessageSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ActivityMessageSO> collection) {
        this.collection = collection;
    }
}
