package org.mentalizr.serviceObjects.frontend;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Program {

    private String id;
    private String name;
    private List<Module> modules;
    private List<Infotext> infotexts;

    public Program() {}

    public Program(String id, String name, List<Module> modules) {
        this.id = id;
        this.name = name;
        this.modules = modules;
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

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Infotext> getInfotexts() {
        return infotexts;
    }

    public void setInfotexts(List<Infotext> infotexts) {
        this.infotexts = infotexts;
    }

}
