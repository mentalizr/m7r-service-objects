package org.mentalizr.serviceObjects.frontend.application;

public abstract class ApplicationConfigBaseSO {

    protected final String name;
    protected final String logo;

    public ApplicationConfigBaseSO(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

}
