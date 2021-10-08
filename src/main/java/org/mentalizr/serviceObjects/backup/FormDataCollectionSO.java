package org.mentalizr.serviceObjects.backup;

import org.mentalizr.serviceObjects.frontend.patient.formData.FormDataSO;
import org.mentalizr.serviceObjects.userManagement.ProgramSO;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class FormDataCollectionSO {

    private List<FormDataSO> collection;

    public FormDataCollectionSO() {
        this.collection = new ArrayList<>();
    }

    public List<FormDataSO> getCollection() {
        return collection;
    }

    public void setCollection(List<FormDataSO> collection) {
        this.collection = collection;
    }

}
