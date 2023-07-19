package org.mentalizr.serviceObjects.frontend.application;

public class ApplicationConfigGenericSO {

    protected String domainName;
    protected String title;
    protected String logo;
    protected String defaultLoginScreen;
    protected String policyVersion;

    public ApplicationConfigGenericSO() {
        this.domainName = "";
        this.title = "";
        this.logo = "";
        this.defaultLoginScreen = "";
        this.policyVersion = "";
    }

    public ApplicationConfigGenericSO(String domainName, String title, String logo, String defaultLoginScreen, String policyVersion) {
        this.domainName = domainName;
        this.title = title;
        this.logo = logo;
        this.defaultLoginScreen = defaultLoginScreen;
        this.policyVersion = policyVersion;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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

    public String getPolicyVersion() {
        return policyVersion;
    }

    public void setPolicyVersion(String policyVersion) {
        this.policyVersion = policyVersion;
    }
}
