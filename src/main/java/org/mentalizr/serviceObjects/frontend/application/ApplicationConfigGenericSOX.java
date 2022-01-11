package org.mentalizr.serviceObjects.frontend.application;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ApplicationConfigGenericSOX {

    public static ApplicationConfigGenericSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ApplicationConfigGenericSO.class);
    }

    public static String toJson(ApplicationConfigGenericSO applicationConfigGenericSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(applicationConfigGenericSO);
    }

    public static String toJsonWithFormatting(ApplicationConfigGenericSO applicationConfigGenericSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(applicationConfigGenericSO);
    }

}
