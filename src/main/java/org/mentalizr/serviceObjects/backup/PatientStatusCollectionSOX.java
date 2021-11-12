package org.mentalizr.serviceObjects.backup;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientStatusCollectionSOX {

    public static PatientStatusCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, PatientStatusCollectionSO.class);
    }

    public static String toJson(PatientStatusCollectionSO patientStatusCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(patientStatusCollectionSO);
    }

    public static String toJsonWithFormatting(PatientStatusCollectionSO patientStatusCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(patientStatusCollectionSO);
    }

}
