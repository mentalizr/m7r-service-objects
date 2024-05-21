package org.mentalizr.serviceObjects.userManagement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStatisticCollectionSO {

    private List<ProgramStatisticSO> collection;

    public ActivityStatisticCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ProgramStatisticSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ProgramStatisticSO> collection) {
        this.collection = collection;
    }
}
