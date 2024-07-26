package org.mentalizr.serviceObjects.userManagement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStatisticCollectionSO {

    private List<ProgramStatisticSO> collection;
    private List<String> projects;

    public ActivityStatisticCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ProgramStatisticSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ProgramStatisticSO> collection) {
        this.collection = collection;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

}
