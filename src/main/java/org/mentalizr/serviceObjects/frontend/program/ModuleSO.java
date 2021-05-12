package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ModuleSO {

    private String id;
    private String name;
    private List<Submodule> submodules;

    public ModuleSO() {}

    public ModuleSO(String id, String name, List<Submodule> submodules) {
        this.id = id;
        this.name = name;
        this.submodules = submodules;
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

    public List<Submodule> getSubmodules() {
        return submodules;
    }

    public void setSubmodules(List<Submodule> submodules) {
        this.submodules = submodules;
    }
}
