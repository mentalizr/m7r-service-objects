package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ProgramSO {

    private String id;
    private String name;
    private boolean blocking;
    private List<ModuleSO> moduleSOs;
    private List<InfotextSO> infotextSOs;

    public ProgramSO() {}

    public ProgramSO(String id, String name, List<ModuleSO> moduleSOs) {
        this.id = id;
        this.name = name;
        this.moduleSOs = moduleSOs;
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

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public List<ModuleSO> getModules() {
        return moduleSOs;
    }

    public void setModules(List<ModuleSO> moduleSOs) {
        this.moduleSOs = moduleSOs;
    }

    public List<InfotextSO> getInfotexts() {
        return infotextSOs;
    }

    public void setInfotexts(List<InfotextSO> infotextSOs) {
        this.infotextSOs = infotextSOs;
    }

}
