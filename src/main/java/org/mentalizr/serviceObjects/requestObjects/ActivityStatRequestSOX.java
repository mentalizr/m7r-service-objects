package org.mentalizr.serviceObjects.requestObjects;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatRequestSOX {

    public static ActivityStatRequestSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityStatRequestSO.class);
    }

    public static String toJson(ActivityStatRequestSO activityStatRequestSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(activityStatRequestSO);
    }

    public static String toJsonWithFormatting(ActivityStatRequestSO activityStatRequestSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(activityStatRequestSO);
    }

}
