package org.mentalizr.serviceObjects.userManagement;

import java.util.HashSet;
import java.util.Set;

public class UserIDCollectionSO {

    private Set<String> collection;

    public UserIDCollectionSO() {
        this.collection = new HashSet<>();
    }

    public Set<String> getCollection() {
        return collection;
    }

    public void setCollection(Set<String> collection) {
        this.collection = collection;
    }

}
