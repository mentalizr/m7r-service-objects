package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ProjectCollectionSO {

    private List<ProjectSO> collection;

    public ProjectCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ProjectSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ProjectSO> collection) {
        this.collection = collection;
    }

}
