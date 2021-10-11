package org.mentalizr.serviceObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ErrorSOX {

    public static ErrorSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ErrorSO.class);
    }

    public static String toJson(ErrorSO errorSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(errorSO);
    }

    public static String toJsonWithFormatting(ErrorSO errorSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(errorSO);
    }

}
