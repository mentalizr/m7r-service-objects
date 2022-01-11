package org.mentalizr.serviceObjects.frontend.application;

public class ApplicationConfigGenericSO {

    protected String title;
    protected String logo;

    public ApplicationConfigGenericSO() {
        this.title = "";
        this.logo = "";
    }

    public ApplicationConfigGenericSO(String title, String logo) {
        this.title = title;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
