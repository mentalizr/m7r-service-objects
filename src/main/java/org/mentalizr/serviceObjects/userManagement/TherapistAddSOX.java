package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class TherapistAddSOX {

    public static TherapistAddSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, TherapistAddSO.class);
    }

    public static String toJson(TherapistAddSO therapistAddSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(therapistAddSO);
    }

    public static String toJsonWithFormatting(TherapistAddSO therapistAddSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(therapistAddSO);
    }
    
}
