package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class TherapistRestoreCollectionSOX {

    public static TherapistRestoreCollectionSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, TherapistRestoreCollectionSO.class);
    }

    public static String toJson(TherapistRestoreCollectionSO therapistRestoreCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(therapistRestoreCollectionSO);
    }

    public static String toJsonWithFormatting(TherapistRestoreCollectionSO therapistRestoreCollectionSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(therapistRestoreCollectionSO);
    }

}
