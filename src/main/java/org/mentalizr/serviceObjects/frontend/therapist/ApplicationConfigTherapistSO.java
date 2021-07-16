package org.mentalizr.serviceObjects.frontend.therapist;

import org.mentalizr.serviceObjects.frontend.application.ApplicationConfigBaseSO;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplicationConfigTherapistSO extends ApplicationConfigBaseSO {

    public ApplicationConfigTherapistSO(String name, String logo) {
        super(name, logo);
    }

}
