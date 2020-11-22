package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class TherapistRestoreSOX {

    public static TherapistRestoreSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, TherapistRestoreSO.class);
    }

    public static String toJson(TherapistRestoreSO therapistRestoreSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(therapistRestoreSO);
    }

    public static String toJsonWithFormatting(TherapistRestoreSO therapistRestoreSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(therapistRestoreSO);
    }

}
