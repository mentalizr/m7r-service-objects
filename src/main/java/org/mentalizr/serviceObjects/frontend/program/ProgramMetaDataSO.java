package org.mentalizr.serviceObjects.frontend.program;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("unused")
@XmlRootElement
public class ProgramMetaDataSO {

    private String id;
    private String name;
    private String family;
    private String title;
    private String subtitle;
    private String version;
    private String author;
    private String editor;
    private String copyright;
    private String license;
    private String logo;

    public ProgramMetaDataSO() {}

    public ProgramMetaDataSO(
            String id,
            String name,
            String family,
            String title,
            String subtitle,
            String version,
            String author,
            String editor,
            String copyright,
            String license,
            String logo) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.title = title;
        this.subtitle = subtitle;
        this.version = version;
        this.author = author;
        this.editor = editor;
        this.copyright = copyright;
        this.license = license;
        this.logo = logo;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
