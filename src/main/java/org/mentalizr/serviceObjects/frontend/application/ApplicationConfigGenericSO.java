package org.mentalizr.serviceObjects.frontend.application;

public class ApplicationConfigGenericSO {

    protected String title;
    protected String logo;
    protected String defaultLoginScreen;

    public ApplicationConfigGenericSO() {
        this.title = "";
        this.logo = "";
        this.defaultLoginScreen = "";
    }

    public ApplicationConfigGenericSO(String title, String logo, String defaultLoginScreen) {
        this.title = title;
        this.logo = logo;
        this.defaultLoginScreen = defaultLoginScreen;
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

    public String getDefaultLoginScreen() {
        return defaultLoginScreen;
    }

    public void setDefaultLoginScreen(String defaultLoginScreen) {
        this.defaultLoginScreen = defaultLoginScreen;
    }

}
