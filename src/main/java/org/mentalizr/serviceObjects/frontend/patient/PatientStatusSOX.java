package org.mentalizr.serviceObjects.frontend.patient;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientStatusSOX {

    public static PatientStatusSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, PatientStatusSO.class);
    }

    public static String toJson(PatientStatusSO patientStatusSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(patientStatusSO);
    }

    public static String toJsonWithFormatting(PatientStatusSO patientStatusSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(patientStatusSO);
    }

}
