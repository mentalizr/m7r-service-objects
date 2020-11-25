package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PatientRestoreCollectionSOX {

    public static PatientRestoreCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, PatientRestoreCollectionSO.class);
    }

    public static String toJson(PatientRestoreCollectionSO patientRestoreCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(patientRestoreCollectionSO);
    }

    public static String toJsonWithFormatting(PatientRestoreCollectionSO patientRestoreCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(patientRestoreCollectionSO);
    }

}
