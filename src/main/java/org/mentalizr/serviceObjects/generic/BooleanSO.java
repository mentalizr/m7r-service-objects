package org.mentalizr.serviceObjects.generic;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BooleanSO {

    private boolean value;

    public BooleanSO() {}

    public BooleanSO(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

}
