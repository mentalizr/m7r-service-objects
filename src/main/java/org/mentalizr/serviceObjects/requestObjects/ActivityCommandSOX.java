package org.mentalizr.serviceObjects.requestObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityCommandSOX {

    public static ActivityCommandSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityCommandSO.class);
    }

    public static String toJson(ActivityCommandSO activityCommandSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(activityCommandSO);
    }

    public static String toJsonWithFormatting(ActivityCommandSO activityCommandSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(activityCommandSO);
    }
}
