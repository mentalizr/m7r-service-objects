package org.mentalizr.serviceObjects.frontend.application;

public abstract class ApplicationConfigBaseSO {

    protected String name;
    protected String logo;

    public ApplicationConfigBaseSO() {
        this.name = "";
        this.logo = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
