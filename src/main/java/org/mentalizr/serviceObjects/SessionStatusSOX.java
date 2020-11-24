package org.mentalizr.serviceObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class SessionStatusSOX {

    public static SessionStatusSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, SessionStatusSO.class);
    }

    public static String toJson(SessionStatusSO sessionStatusSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(sessionStatusSO);
    }

    public static String toJsonWithFormatting(SessionStatusSO sessionStatusSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(sessionStatusSO);
    }

}
