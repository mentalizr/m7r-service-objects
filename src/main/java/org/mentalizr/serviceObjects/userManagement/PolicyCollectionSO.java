package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class PolicyCollectionSO {

    private List<PolicySO> collection;

    public PolicyCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<PolicySO> getCollection() {
        return collection;
    }

    public void setCollection(List<PolicySO> collection) {
        this.collection = collection;
    }

}
