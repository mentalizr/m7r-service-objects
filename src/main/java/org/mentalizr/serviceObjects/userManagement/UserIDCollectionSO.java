package org.mentalizr.serviceObjects.userManagement;

import java.util.ArrayList;
import java.util.List;

public class UserIDCollectionSO {

    private List<String> collection;

    public UserIDCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

}
