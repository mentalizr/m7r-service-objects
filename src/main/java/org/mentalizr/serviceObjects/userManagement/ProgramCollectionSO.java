package org.mentalizr.serviceObjects.userManagement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class ProgramCollectionSO {

    private List<ProgramSO> collection;

    public ProgramCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<ProgramSO> getCollection() {
        return collection;
    }

    public void setCollection(List<ProgramSO> collection) {
        this.collection = collection;
    }

}
