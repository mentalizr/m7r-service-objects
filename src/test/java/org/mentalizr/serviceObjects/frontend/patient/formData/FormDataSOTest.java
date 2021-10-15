package org.mentalizr.serviceObjects.frontend.patient.formData;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormDataSOTest {

    @Test
    public void test() {

        String json = "{\"userId\":\"671da106-611e-477a-9c2f-8a0cd2589436\",\"contentId\":\"dep_m1_sm1_s2\",\"formElementDataList\":[{\"formElementId\":\"symptome\",\"formElementType\":\"input\",\"formElementValue\":\"erste Zeile\"}],\"exercise\":{\"lastModifiedTimestamp\":\"1970-01-01T00:00:00.000Z\",\"seenByTherapist\":false,\"seenByTherapistTimestamp\":\"1970-01-01T00:00:00.000Z\",\"sent\":false}}";

        FormDataSO formDataSO = FormDataSOX.fromJson(json);

        assertEquals("671da106-611e-477a-9c2f-8a0cd2589436", formDataSO.getUserId());
        assertEquals("dep_m1_sm1_s2", formDataSO.getContentId());
        assertEquals("1970-01-01T00:00:00.000Z", formDataSO.getExercise().getLastModifiedTimestamp());
        assertEquals("symptome", formDataSO.getFormElementDataList().get(0).getFormElementId());

    }
}
