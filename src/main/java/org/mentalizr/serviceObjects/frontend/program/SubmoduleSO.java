package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class SubmoduleSO {

    private String id;
    private String name;
    private boolean accessible = true;
    private List<StepSO> stepSOs;

    public SubmoduleSO() {}

    public SubmoduleSO(String id, String name, List<StepSO> stepSOs) {
        this.id = id;
        this.name = name;
        this.stepSOs = stepSOs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public List<StepSO> getSteps() {
        return stepSOs;
    }

    public void setSteps(List<StepSO> stepSOs) {
        this.stepSOs = stepSOs;
    }
}
