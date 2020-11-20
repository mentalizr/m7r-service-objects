package org.mentalizr.serviceObjects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorSO {

    private String message;

    public ErrorSO() {
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ErrorSO withMessage(String message) {
        ErrorSO errorSO = new ErrorSO();
        errorSO.setMessage(message);
        return errorSO;
    }

}
