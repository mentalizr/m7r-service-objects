package org.mentalizr.serviceObjects.requestObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityCommandSOX {

    public static ActivityQuerySO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityQuerySO.class);
    }

    public static String toJson(ActivityQuerySO activityQuerySO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(activityQuerySO);
    }

    public static String toJsonWithFormatting(ActivityQuerySO activityQuerySO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(activityQuerySO);
    }
}
