package org.mentalizr.serviceObjects.frontend.patient;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ApplicationConfigPatientSOX {

    public static ApplicationConfigPatientSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ApplicationConfigPatientSO.class);
    }

    public static String toJson(ApplicationConfigPatientSO applicationConfigPatientSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(applicationConfigPatientSO);
    }

    public static String toJsonWithFormatting(ApplicationConfigPatientSO applicationConfigPatientSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(applicationConfigPatientSO);
    }

}
