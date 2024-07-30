package org.mentalizr.serviceObjects.userManagement;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ActivityStatisticCollectionSO {

    private List<ProgramStatisticSO> collection;
    private List<String> projectLabels;

    public ActivityStatisticCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ProgramStatisticSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ProgramStatisticSO> collection) {
        this.collection = collection;
    }

    public List<String> getProjectLabels() {
        return projectLabels;
    }

    public void setProjectLabels(List<String> projectLabels) {
        this.projectLabels = projectLabels;
    }

}
