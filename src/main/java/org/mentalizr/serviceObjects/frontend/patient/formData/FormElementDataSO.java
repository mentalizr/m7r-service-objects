package org.mentalizr.serviceObjects.frontend.patient.formData;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
public class FormElementDataSO {

    public static final String FORM_ELEMENT_TYPE = "formElementType";
    public static final String FORM_ELEMENT_ID = "formElementId";
    public static final String FORM_ELEMENT_VALUE = "formElementValue";

    private String formElementType;
    private String formElementId;
    private String formElementValue;

    public FormElementDataSO() {
    }

    public FormElementDataSO(String formElementType, String formElementId, String formElementValue) {
        this.formElementType = formElementType;
        this.formElementId = formElementId;
        this.formElementValue = formElementValue;
    }

    public String getFormElementType() {
        return this.formElementType;
    }

    public void setFormElementType(String formElementType) {
        this.formElementType = formElementType;
    }

    public String getFormElementId() {
        return formElementId;
    }

    public void setFormElementId(String formElementId) {
        this.formElementId = formElementId;
    }

    public String getFormElementValue() {
        return formElementValue;
    }

    public void setFormElementValue(String formElementValue) {
        this.formElementValue = formElementValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormElementDataSO that = (FormElementDataSO) o;
        return formElementType.equals(that.formElementType) &&
                formElementId.equals(that.formElementId) &&
                formElementValue.equals(that.formElementValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formElementType, formElementId, formElementValue);
    }

    @Override
    public String toString() {
        return "FormElementDataSO{" +
                "formElementType='" + formElementType + '\'' +
                ", formElementId='" + formElementId + '\'' +
                ", formElementValue='" + formElementValue + '\'' +
                '}';
    }
}
