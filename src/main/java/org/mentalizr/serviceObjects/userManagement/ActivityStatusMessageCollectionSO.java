package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ActivityStatusMessageCollectionSO {

    private List<ActivityStatusMessageSO> collection;

    public ActivityStatusMessageCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ActivityStatusMessageSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ActivityStatusMessageSO> collection) {
        this.collection = collection;
    }
}
