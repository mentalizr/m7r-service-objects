package org.mentalizr.serviceObjects.frontend.patient.formData;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class FormDataSO {

    public static final String USER_ID = "userId";
    public static final String CONTENT_ID = "contentId";
    public static final String EDITABLE = "editable";
    public static final String FORM_ELEMENT_DATA_LIST = "formElementDataList";

    private String userId;
    private String contentId;
    private boolean editable;
    private List<FormElementDataSO> formElementDataSOList;

    public FormDataSO() {
        this.userId = "";
        this.contentId = "";
        this.editable = true;
        this.formElementDataSOList = new ArrayList<>();
    }

    public FormDataSO(String userId, String contentId, boolean editable, List<FormElementDataSO> formElementDataSOList) {
        this.userId = userId;
        this.contentId = contentId;
        this.editable = editable;
        this.formElementDataSOList = formElementDataSOList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public List<FormElementDataSO> getFormElementDataList() {
        return formElementDataSOList;
    }

    public void setFormElementDataList(List<FormElementDataSO> formElementDataSOList) {
        this.formElementDataSOList = formElementDataSOList;
    }

    @Override
    public String toString() {
        return FormDataSOX.toJsonWithFormatting(this);
    }

}
