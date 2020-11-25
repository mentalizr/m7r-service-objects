package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientAddSOX {

    public static PatientAddSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, PatientAddSO.class);
    }

    public static String toJson(PatientAddSO patientAddSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(patientAddSO);
    }

    public static String toJsonWithFormatting(PatientAddSO patientAddSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(patientAddSO);
    }
    
}
