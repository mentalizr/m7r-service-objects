package org.mentalizr.serviceObjects.userManagement;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class ActivityStatusMessageSOX {

    public static ActivityStatusMessageSO fromJson(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, ActivityStatusMessageSO.class);
    }

    public String toJson(ActivityStatusMessageSO activityStatusMessageSO) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.toJson(activityStatusMessageSO);
    }

    public static String toJsonWithFormatting(ActivityStatusMessageSO activityStatusMessageSO) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig().withFormatting(true));
        return jsonb.toJson(activityStatusMessageSO);
    }
}
