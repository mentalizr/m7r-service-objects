package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class AccessKeyCollectionSO {

    private List<AccessKeyRestoreSO> collection;

    public AccessKeyCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<AccessKeyRestoreSO> getCollection() {
        return collection;
    }

    public void setCollection(List<AccessKeyRestoreSO> collection) {
        this.collection = collection;
    }

}
